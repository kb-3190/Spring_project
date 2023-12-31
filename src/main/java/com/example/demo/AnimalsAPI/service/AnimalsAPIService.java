package com.example.demo.AnimalsAPI.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.data.Animals;
import com.example.demo.AnimalsAPI.repository.AnimalsAPIRepository;

@Service
public class AnimalsAPIService {
	
	private final AnimalsAPIRepository animalsAPIRepository;
	
	public AnimalsAPIService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}
	
	public Animals[] getAnimalsList() throws IOException {
		
		Animals[] animalsList = animalsAPIRepository.getAnimals();
		
		return animalsList;
	}
	
	public Animals getAnimals(String index) throws IOException {
		
		Animals result;
		
		Animals[] animalsList = animalsAPIRepository.getAnimals();
		
		result = animalsList[Integer.valueOf(index) - 1];
		
		return result; 
	}
}
