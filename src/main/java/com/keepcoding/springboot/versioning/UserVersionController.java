package com.keepcoding.springboot.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserVersionController {
	
	@GetMapping("/v1/userVersioning")
	public UserVersionV1 getUserVersion1() {
		return new UserVersionV1("nombre");
	}
	
	@GetMapping("/v2/userVersioning")
	public UserVersionV2 getUserVersion2() {
		return new UserVersionV2(new NameStructure("nombre","apellido"));
	}
	
	// PARAMS
	
	@GetMapping(value = "/userVersioning/params", params = "version=1")
	public UserVersionV1 getUserVersion1Params() {
		return new UserVersionV1("nombre");
	}
	
	@GetMapping(value = "/userVersioning/params", params = "version=2")
	public UserVersionV2 getUserVersion2Params() {
		return new UserVersionV2(new NameStructure("nombre","apellido"));
	}
	
	// HEADER
	
	@GetMapping(value = "/userVersioning/header", headers = "X-API-VERSION=1")
	public UserVersionV1 getUserVersion1Header() {
		return new UserVersionV1("nombre");
	}
	
	@GetMapping(value = "/userVersioning/header", headers = "X-API-VERSION=2")
	public UserVersionV2 getUserVersion2Header() {
		return new UserVersionV2(new NameStructure("nombre","apellido"));
	}
	
	// Content negociation
	
	@GetMapping(value = "/userVersioning/produces", produces = "application/vdn.company.app-v1+json")
	public UserVersionV1 getUserVersion1Produces() {
		return new UserVersionV1("nombre");
	}
	
	@GetMapping(value = "/userVersioning/produces", produces = "application/vdn.company.app-v2+json")
	public UserVersionV2 getUserVersion2Produces() {
		return new UserVersionV2(new NameStructure("nombre","apellido"));
	}
}
