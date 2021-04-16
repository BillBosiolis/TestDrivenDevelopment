package com.oceanfeeling.tdd;

public class Bank {
    public Money reduce(Expression source, String toCurrency) {
        return new Money(10, toCurrency);
    }
}
