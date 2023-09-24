package com.example.calculatorApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*.*")
public class CalculatorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorAppApplication.class, args);
	}

}
