package com.keepcoding.springboot.filtering;

public class UserFilterDto {

	private int id;
	private String name;
	private String password;
	
	public UserFilterDto() {
		super();
	}

	public UserFilterDto(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
}
