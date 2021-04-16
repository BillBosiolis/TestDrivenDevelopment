package com.oceanfeeling.tdd;

public class Money implements Expression {
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
        return amount == otherMoney.amount && currency.equals(otherMoney.currency);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String currency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }
}
