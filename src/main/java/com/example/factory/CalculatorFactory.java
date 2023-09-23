package com.example.factory;

import com.example.interfaces.Addition;
import com.example.interfaces.Division;
import com.example.interfaces.ICalculator;
import com.example.interfaces.Multiplication;
import com.example.interfaces.Subtraction;

public class CalculatorFactory {
    public static ICalculator createCalculator(Character operator) {
        switch (operator) {
            case '+':
                return new Addition();
            case '-':
                return new Subtraction();
            case '*':
                return new Multiplication();
            case '/':
                return new Division();
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
