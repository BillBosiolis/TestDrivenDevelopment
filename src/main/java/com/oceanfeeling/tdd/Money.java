package com.oceanfeeling.tdd;

public abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        Money otherMoney = (Money) o;
        if(otherMoney == null) return false;
        return amount == otherMoney.amount && getClass().equals(otherMoney.getClass());
    }

    public abstract Money times(int amount);

    public abstract String currency();

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
