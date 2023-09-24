package com.example.utility;

import com.example.interfaces.ICalculator;

public class Multiplication implements ICalculator {
    @Override
    public double calculate(Double a, Double b) {
        return  a*b;
    }
}
