package com.example.service;


import com.example.utility.Utility;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CalculatorService {

    HashMap<String, Double> map = new HashMap<>();

    public double calculate(String expression) {
        return Utility.evaluateExpression(expression);
    }

    public double getValueByKey(String key) {
        return map.get(key);
    }


}