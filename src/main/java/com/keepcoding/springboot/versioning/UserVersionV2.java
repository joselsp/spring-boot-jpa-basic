package com.keepcoding.springboot.versioning;

public class UserVersionV2 {
	
	private NameStructure name;

	public UserVersionV2() {
		super();
	}

	public UserVersionV2(NameStructure name) {
		super();
		this.name = name;
	}

	public NameStructure getName() {
		return name;
	}

	public void setName(NameStructure name) {
		this.name = name;
	}
}
