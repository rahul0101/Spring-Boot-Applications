package com.example.demo.mes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloMes {
	@GetMapping("/hello")
	public String sayHello(@RequestParam(value="name", required=false, defaultValue="World") String name)
	{
		return "Hello "+ name+"!";
	}
}
