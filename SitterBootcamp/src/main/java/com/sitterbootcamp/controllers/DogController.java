package com.sitterbootcamp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sitterbootcamp.models.Dog;
import com.sitterbootcamp.services.DogService;

@RestController
@RequestMapping("dogs")
public class DogController {
	@Autowired
	private DogService dogService;
	
	@GetMapping
	public List<Dog> findAll() {
		return dogService.findAll();
	}
	
	@GetMapping("{dogId}")
	public Dog getOneDog(@PathVariable int dogId) {
		return dogService.getOneDog(dogId);
	}
	
	@GetMapping("breed/{breedName}")
	public List<Dog> getByBreedName(@PathVariable String breedName){
		return dogService.getByBreedName(breedName);
	}
	
	@GetMapping("sitter/{sitterId}")
	public List<Dog> getDogBySitterId(@PathVariable int sitterId) {
		return dogService.getDogBySitterId(sitterId);
	}
	
	@PostMapping
	public Dog createNewDog(@RequestBody Dog dog) {
		return dogService.createNewDog(dog);
	}
	
	@PutMapping("{dogId}")
	public Dog update(@RequestBody Dog dog) {
		return dogService.update(dog);	
	}
}
