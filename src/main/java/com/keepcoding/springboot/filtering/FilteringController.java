package com.keepcoding.springboot.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filter")
	public UserFilterDto getUserFiltered() {
		return new UserFilterDto(1, "user1", "1234");
	}
}
