package com.example.interfaces;

public class Multiplication implements ICalculator {
    @Override
    public double calculate(Double a, Double b) {
        return  a*b;
    }
}
