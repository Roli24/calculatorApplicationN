package com.example.service;


import com.example.model.CalculatorRequest;
import com.example.model.SaveRequest;
import com.example.utility.Utility;

import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class CalculatorService {

    static HashMap<String, Double> map = new HashMap<>();

    public double calculate(CalculatorRequest calculatorRequest) {
        return Utility.evaluateExpression(calculatorRequest.getExpression());
    }

    public double save(SaveRequest saveRequest) {
        if (map.size() > 0 && map.containsKey(saveRequest.getName())) {return map.get(saveRequest.getName());}
        map.put(saveRequest.getName(), Utility.evaluateExpression(saveRequest.getExpression()));
        return map.get(saveRequest.getName());
    }


    public double getExpressionValueByName(String name) throws Exception {
        if (!map.containsKey(name)) {throw new Exception();}
        return map.get(name);
    }
}