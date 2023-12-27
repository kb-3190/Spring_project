package com.example.demo.AnimalsAPI;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalsAPIRepository {
	
	public Animals[] getAnimals() throws IOException {
		
		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi";
		
		RestTemplate rest = new RestTemplate();
		
		ResponseEntity<String> responce = rest.getForEntity(url, String.class);
		
		String json = responce.getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		
		Animals[] animalsList = mapper.readValue(json, Animals[].class);
		
		return animalsList;
	}
}
