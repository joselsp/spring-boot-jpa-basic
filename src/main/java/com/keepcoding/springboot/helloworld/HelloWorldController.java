package com.keepcoding.springboot.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String helloworld() {
		return messageSource.getMessage("hello.world.message", null, LocaleContextHolder.getLocale());
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
