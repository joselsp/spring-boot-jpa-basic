package com.keepcoding.springboot.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.keepcoding.springboot.dao.HeroDaoService;
import com.keepcoding.springboot.exceptions.HeroNotFoundException;
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
		
		Hero result = heroDaoService.findHeroById(id);
		
		if (result == null) {
			throw new HeroNotFoundException("El heroe con id " + id + " no existe");
		}
		
		return result;
	}
	
	@DeleteMapping("/hero/{id}")
	public void deleteHeroById(@PathVariable int id) {
		
		boolean result = heroDaoService.deleteHero(id);
		
		if (!result) {
			throw new HeroNotFoundException("El heroe con id " + id + " no existe");
		}
	}
	
	@PostMapping("/hero")
	public ResponseEntity<Object> addHero(@RequestBody @Valid Hero hero) {
		Hero addedHero =  heroDaoService.addHero(hero);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(addedHero.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}	
}
