package com.example.controller;

import com.example.service.CalculatorService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class CalculatorController {

    @PostMapping("/calculate")
    public ResponseEntity<Double> performCalculation(@RequestBody String expression) {
        CalculatorService calculatorService = new CalculatorService();
        Double result = calculatorService.calculate(expression);
        return ResponseEntity.ok(result);
    }
}
