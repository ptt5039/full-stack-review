package com.sitterbootcamp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sitterbootcamp.models.Dog;

public interface DogRepo extends JpaRepository<Dog, Integer> {

	@Query("FROM Dog d WHERE LOWER(d.breed) LIKE LOWER(:breedName)")
	List<Dog> findByBreed(String breedName);

	List<Dog> findBySitterSitterId(int sitterId);

}
