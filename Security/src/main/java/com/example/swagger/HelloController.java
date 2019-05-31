package com.example.swagger;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Secured("ROLE_USER")  //Only allows ADMIN to access method.
	@GetMapping("/hello")
	public String show()
	{
		return "Hello!";
	}
}
