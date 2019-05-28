package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Emp;
import com.example.demo.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/list")
	public Iterable<Emp> getall(){
		return empService.getallemp();
	}
	
	@PostMapping("/emps")
	public void addEmp(@RequestBody Emp emp)
	{
		System.out.println(emp);
		empService.addEmp(emp);
	}

}
