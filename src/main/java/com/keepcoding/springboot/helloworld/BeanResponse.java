package com.keepcoding.springboot.helloworld;

public class BeanResponse {
	
	private String message;

	public BeanResponse() {
		super();
	}

	public BeanResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
