package com.keepcoding.springboot.dao;

import java.util.List;

import com.keepcoding.springboot.model.Hero;
import com.keepcoding.springboot.model.Power;

public interface HeroService {
	List<Hero> findAll();
	Hero findHeroById(int id);
	Hero addHero(Hero hero);
	void deleteHero(int id);
	
	List<Power> findAllPowersByHeroId(int heroId);
	Power findPowerById(int heroId, int powerId);
	Power addPower(int heroId, Power power);
	void deletePower(int heroId, int powerId);
}
