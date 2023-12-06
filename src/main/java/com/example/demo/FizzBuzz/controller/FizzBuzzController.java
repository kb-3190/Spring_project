package com.example.demo.FizzBuzz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.FizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {
	
	private final FizzBuzzService fizzBuzzService;
	
	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}
	
	@GetMapping("fizzBuzz")
	public String fizzBazz(Model model) {
		
		List<String> results = fizzBuzzService.fizzBazz();
		
		model.addAttribute("results", results);
		
		return "fizzBuzz.html";
	}
	
}