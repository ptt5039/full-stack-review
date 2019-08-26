package com.sitterbootcamp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sitterbootcamp.models.Dog;
import com.sitterbootcamp.repos.DogRepo;

@Service
public class DogService {
	@Autowired
	private DogRepo	dogRepo;

	public List<Dog> findAll() {
		return dogRepo.findAll();
	}

	public Dog getOneDog(int dogId) {
		return dogRepo.getOne(dogId);
	}

	public List<Dog> getByBreedName(String breedName) {
		breedName = "%" + breedName +"%";
		return dogRepo.findByBreed(breedName);
	}

	public List<Dog> getDogBySitterId(int sitterId) {
		return dogRepo.findBySitterSitterId(sitterId);
	}

	public Dog createNewDog(Dog dog) {
		return dogRepo.save(dog);
	}

	public Dog update(Dog dog) {
		return dogRepo.saveAndFlush(dog);
	}
}
