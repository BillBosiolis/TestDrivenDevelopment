package com.oceanfeeling.tdd;

public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money otherMoney = (Money) o;
        return amount == otherMoney.amount && getClass().equals(otherMoney.getClass());
    }

    public abstract Money times(int amount);

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }
}
