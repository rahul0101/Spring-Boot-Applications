package com.example.demo.controller;

import java.text.ParseException;
import java.util.List;
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
	
	//Find Employee By Last name and age
	@GetMapping("/lastnameandage/{name}&{age}")
	public List<Emp> findByLastNameAndAge(@PathVariable("name") String name, @PathVariable("age") String age)
	{
		return empService.fbLastNameAndAge(name, Integer.parseInt(age));
	}
	
	//Find dept name of emp given his/her first name
	@GetMapping("/dept/{name}")
	public String getdept(@PathVariable String name) {
		
		return empService.getDept(name);
	}
	
	//Get emp details created before current time
	@GetMapping("/CreatedTimeBefore")
	public List<Emp> findByCreatedTimeBefore() throws ParseException
	{
		return empService.findByCreatedTimeBefore();
	}
	
	//Get emp details created after current time
	@GetMapping("/CreatedTimeAfter")
	public List<Emp> findByCreatedTimeAfter() throws ParseException
	{
		return empService.findByCreatedTimeAfter();
	}
	
}
