package com.keepcoding.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.keepcoding.springboot.model.Hero;
import com.keepcoding.springboot.repository.HeroRepository;

@Service
@Qualifier("jpa")
public class HeroJpaService implements HeroService {
	
	@Autowired
	private HeroRepository heroRepository;

	@Override
	public List<Hero> findAll() {
		return heroRepository.findAll();
	}

	@Override
	public Hero findHeroById(int id) {
		return heroRepository.findById(id).orElse(null);
	}

	@Override
	public Hero addHero(Hero hero) {
		return heroRepository.save(hero);
	}

	@Override
	public void deleteHero(int id) {
		Hero hero = heroRepository.findById(id).orElse(null);
		if (hero != null) {
			heroRepository.delete(hero);
		}
	}
}
