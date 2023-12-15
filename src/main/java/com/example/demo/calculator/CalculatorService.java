package com.example.demo.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public String calculate(int num1, int num2, String operator) {
		
		int result = 0;
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		
		return Integer.toString(result);
	}
}
