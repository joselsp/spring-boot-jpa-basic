package com.keepcoding.springboot.dao;

import java.util.List;

import com.keepcoding.springboot.model.Hero;

public interface HeroService {
	List<Hero> findAll();
	Hero findHeroById(int id);
	Hero addHero(Hero hero);
	boolean deleteHero(int id);
}
