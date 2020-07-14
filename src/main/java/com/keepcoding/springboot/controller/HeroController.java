package com.keepcoding.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
