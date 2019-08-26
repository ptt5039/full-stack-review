package com.sitterbootcamp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sitterbootcamp.models.Sitter;
import com.sitterbootcamp.repos.SitterRepo;

@Service
public class SitterService {
	@Autowired
	private SitterRepo sitterRepo;

	public List<Sitter> findAll() {
		return sitterRepo.findAll();
	}

	public Sitter getById(int sitterId) {
		return sitterRepo.getOne(sitterId);
	}

	public List<Sitter> getByName(String name) {
		name = "%" + name + "%";
		return sitterRepo.findBySitterNameLike(name);
	}

	public Sitter newSitter(Sitter sitter) {
		return sitterRepo.save(sitter);
	}
}
