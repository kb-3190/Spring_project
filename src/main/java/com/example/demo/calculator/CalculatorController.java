package com.example.demo.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	
	public final CalculatorService calculatorService;
	
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	} 
	
	@GetMapping("/calculator")
	public String calculator() {
		
		return "calculator.html";
	}
	
	@PostMapping("/calculator")
	public String calculator(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2, @RequestParam(name = "operator") String operator, Model model) {
		
		String result = "";
		
		result = String.valueOf(calculatorService.calculate(num1, num2, operator));
		
		model.addAttribute("result", result);
		
		return "calculator.html";
	}

}
