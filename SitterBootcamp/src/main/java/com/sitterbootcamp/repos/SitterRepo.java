package com.sitterbootcamp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sitterbootcamp.models.Sitter;

public interface SitterRepo extends JpaRepository<Sitter, Integer> {

	List<Sitter> findBySitterNameLike(String name);

}
