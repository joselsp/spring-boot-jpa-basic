package com.keepcoding.springboot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.keepcoding.springboot.dao.HeroDaoService;
import com.keepcoding.springboot.model.Hero;

@RestController
public class HeroController {
	
	@Autowired
	private HeroDaoService heroDaoService;

	@GetMapping("/hero")
	public List<Hero> findAllHeroes() {
		return heroDaoService.findAll();
	}
	
	@GetMapping("/hero/{id}")
	public Hero findHeroById(@PathVariable int id) {
		return heroDaoService.findHeroById(id);
	}
	
	// POST 
	// Devolver estado 201: Created
	// Devolver uri del nuevo recurso creado
	@PostMapping("/hero")
	public ResponseEntity<Object> addHero(@RequestBody Hero hero) {
		Hero addedHero =  heroDaoService.addHero(hero);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(addedHero.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
}
