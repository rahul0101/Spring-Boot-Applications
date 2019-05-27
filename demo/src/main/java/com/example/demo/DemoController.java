package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/")
	String home(ModelMap modal)
	{
		modal.addAttribute("title", "Dear Learner");
        modal.addAttribute("message", "Welcome to SpringBoot");
        return "hello";
	}
}
