package com.oceanfeeling.tdd;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money otherMoney = (Money) o;
        return amount == otherMoney.amount && getClass().equals(otherMoney.getClass());
    }
}
