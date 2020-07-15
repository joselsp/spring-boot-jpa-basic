package com.keepcoding.springboot.versioning;

public class UserVersionV1 {
	private String name;

	public UserVersionV1() {
		super();
	}

	public UserVersionV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
