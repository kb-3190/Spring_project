package com.example.demo.AnimalsAPI;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class AnimalsAPIService {
	
	private final AnimalsAPIRepository animalsAPIRepository;
	
	public AnimalsAPIService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}
	
	public Animals getAnimals(String index) throws IOException {
		
		Animals result;
		
		Animals[] animalsList = animalsAPIRepository.getAnimals();
		
		result = animalsList[Integer.valueOf(index)];
		
		return result; 
	}
}
