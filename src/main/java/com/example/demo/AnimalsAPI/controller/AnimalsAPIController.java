package com.example.demo.AnimalsAPI.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.data.Animals;
import com.example.demo.AnimalsAPI.service.AnimalsAPIService;

@Controller
public class AnimalsAPIController {
	
	private final AnimalsAPIService animalsAPIService;
	
	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {
		this.animalsAPIService = animalsAPIService;
	}
	
	@GetMapping("/search")
	public String search(Model model) throws IOException {
		
		Animals[] animalsList = animalsAPIService.getAnimalsList();
		
		model.addAttribute("animalsList", animalsList);
		
		return "searchAnimals.html";
	}
	
	@GetMapping("/result")
	public String result(@RequestParam(name = "index") String index, Model model) throws IOException {
		
		Animals animal = animalsAPIService.getAnimals(index);
		
		model.addAttribute("animal", animal);
		
		return "animalDetails.html";
	}

}
