package com.example.controller;

import com.example.model.CalculatorRequest;
import com.example.model.SaveRequest;
import com.example.service.CalculatorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class CalculatorController {

    @PostMapping("/calculate")
    public double calculateExpression(@RequestBody CalculatorRequest request) {
        CalculatorService calculatorService = new CalculatorService();
        // Implement the logic to evaluate the expression here
        double result = calculatorService.calculate(request);
        return result;
    }

    @PostMapping("/save")
    public String save(@RequestBody SaveRequest saveRequest) {
        CalculatorService calculatorService = new CalculatorService();
        // Implement the logic to evaluate the expression here
        double result = calculatorService.save(saveRequest);
        return "Result saved successfully "+result;
    }

    @GetMapping("/expression/{name}")
    @ResponseBody
    public String getExpressionByName(@PathVariable String name) {
        try {
            CalculatorService calculatorService = new CalculatorService();
            // Implement the logic to evaluate the expression here
            double result = calculatorService.getExpressionValueByName(name);
            return String.valueOf(result);
        }
        catch (Exception ex) {
            return "Value does not exists";
        }

    }
}
