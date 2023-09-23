package com.example.interfaces;

public class Division implements ICalculator {
    @Override
    public double calculate(Double a, Double b) {
        return a/b;
    }
}
