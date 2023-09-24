package com.example.factory;

import com.example.utility.Addition;
import com.example.utility.Division;
import com.example.interfaces.ICalculator;
import com.example.utility.Multiplication;
import com.example.utility.Subtraction;

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
