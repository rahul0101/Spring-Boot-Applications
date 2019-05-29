package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Emp;
import com.example.demo.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	//Show all employees
	@GetMapping("/show")
	public Iterable<Emp> getall(){
		return empService.getallemp();
	}
	
	//Employee by ID
	@GetMapping("/emp/{id}")
	public Optional<Emp> getEmp(@PathVariable String id) {
		System.out.println(id);
		return empService.getEmp(id);
	}
	
	//Add Employee
	@PostMapping("/add")
	public void addEmp(@RequestBody Emp emp)
	{
		empService.addEmp(emp);
	}
	
	//Delete Employee
	@DeleteMapping("/delete/{id}")
	public String delEmp(@PathVariable String id)
	{
		empService.delEmp(id);
		
		return "Employee details with id : "+id+" deleted!";
	}
	
	//Update Employee
	@PutMapping("/update/{id}")
	public Emp updateEmp(@RequestBody Emp emp, @PathVariable String id)
	{
		return empService.updateEmp(id, emp);
	}
}
