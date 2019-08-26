package com.sitterbootcamp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sitterbootcamp.models.Sitter;
import com.sitterbootcamp.services.SitterService;

@RestController
@RequestMapping("sitters")
public class SitterController {
	
	@Autowired
	private SitterService sitterService;
	
	@GetMapping
	public List<Sitter> findAll(){
		return sitterService.findAll();
	}
	
	@GetMapping("{sitterId}")
	public Sitter getById(@PathVariable int sitterId) {
		return sitterService.getById(sitterId);
	}
	
	@GetMapping("name/{name}")
	public List<Sitter> findByName(@PathVariable String name){
		return sitterService.getByName(name);
	}
	
	@PostMapping
	public Sitter newSitter(@RequestBody Sitter sitter) {
		return sitterService.newSitter(sitter);
	}
}
