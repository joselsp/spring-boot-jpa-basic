package com.keepcoding.springboot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(value = "/hello-world-bean")
	public BeanResponse helloWorldBean()  {
		return new BeanResponse("Hello World Bean!");
	}
	
	@GetMapping(value = "/hello-world/path-variable/{name}")
	public String helloWorldVariable(@PathVariable String name) {
		return "Hello " + name + "!";
	}
}
