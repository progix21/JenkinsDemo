package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/sayHello")
	public String sayHello(@RequestParam("name") String name) {
		return "Hello Again, " + name;
	}
	
}
