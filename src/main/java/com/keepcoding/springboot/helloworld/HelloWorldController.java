package com.keepcoding.springboot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotar la clase como un controlador
// Crear metodos que responden a los endpoints
// Configurar esos metodos
@RestController
public class HelloWorldController {

	// GET /hello-world
	@GetMapping(value = "/hello-world")
	public String helloworld() {
		return "Hello World!";
	}	
}
