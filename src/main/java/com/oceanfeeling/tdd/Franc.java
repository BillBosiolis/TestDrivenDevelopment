package com.oceanfeeling.tdd;

public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }

}
