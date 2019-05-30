package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dept;
import com.example.demo.model.Emp;
import com.example.demo.repository.EmpRepository;
import com.example.demo.service.DeptService;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private DeptService deptService;
	
	//Show all employees
	public Iterable<Emp> getallemp(){
		return empRepository.findAll();
	}
	
	//Add Employee
	public void addEmp(Emp e)
	{
		empRepository.save(e);
	}
	
	//Delete Employee
	public void delEmp(String id)
	{
		empRepository.deleteById(Integer.parseInt(id));
	}

	//Employee by ID
	public Optional<Emp> getEmp(String id)
	{
		System.out.println(id);
		
		return empRepository.findById(Integer.parseInt(id));
	}
	
	//Update Employee
	public Emp updateEmp(String id, Emp emp)
	{
		emp.setEmp_ID(Integer.parseInt(id));
		return empRepository.save(emp);
	}
	
	//Find Employee By Last name and age
	public List<Emp> fbLastNameAndAge(String name, int age) {
		return empRepository.findByLastNameAndAge(name, age);
	}

	//Find dept name of emp given his/her first name
	public String getDept(String name) {
		
		Emp emp = empRepository.findByFirstName(name);
		
		Dept dept = deptService.getDept(emp.getEmp_ID());
		
		return name + " belongs to "+ dept.getName() + " department";
	}

	//Get emp details created before current time
	public List<Emp> findByCreatedTimeBefore() {
		
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		//return empRepository.findByCreatedtimeBefore(format.parse("2019-05-30 00:00:00"));
		
		return empRepository.findByCreatedtimeBefore(java.util.Calendar.getInstance().getTime());
	}
	
	//Get emp details created after current time
	public List<Emp> findByCreatedTimeAfter() {
		return empRepository.findByCreatedtimeAfter(java.util.Calendar.getInstance().getTime());
	}
}
