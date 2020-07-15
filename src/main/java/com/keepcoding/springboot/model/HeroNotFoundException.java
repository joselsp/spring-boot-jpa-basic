package com.keepcoding.springboot.model;

public class HeroNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public HeroNotFoundException(String message) {
		super(message);
	}
}
