package com.example.utility;

import com.example.interfaces.ICalculator;

public class Division implements ICalculator {
    @Override
    public double calculate(Double a, Double b) {
        return a/b;
    }
}
