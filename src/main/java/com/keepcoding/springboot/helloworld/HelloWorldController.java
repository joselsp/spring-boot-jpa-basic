package com.keepcoding.springboot.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// Anotar la clase como un controlador
// Crear metodos que responden a los endpoints
// Configurar esos metodos
@Controller
public class HelloWorldController {

	// GET /hello-world
	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public @ResponseBody String helloworld() {
		return "Hello World!";
	}	
}
