package com.keepcoding.springboot.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

// Anotar la clase como un controlador
// Crear metodos que responden a los endpoints
// Configurar esos metodos
@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;

	// GET /hello-world
	@GetMapping(value = "/hello-world")
	public String helloworld(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("hello.world.message", null, locale);
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
