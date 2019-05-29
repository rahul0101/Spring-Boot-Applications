package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dept;
import com.example.demo.model.Emp;
import com.example.demo.repository.DeptRepository;
import com.example.demo.repository.EmpRepository;
import com.example.demo.service.DeptService;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private DeptService deptService;
	
	public Iterable<Emp> getallemp(){
		return empRepository.findAll();
	}
	
	public void addEmp(Emp e)
	{
		empRepository.save(e);
	}
	
	public void delEmp(String id)
	{
		empRepository.deleteById(Integer.parseInt(id));
	}

	public Optional<Emp> getEmp(String id)
	{
		System.out.println(id);
		
		return empRepository.findById(Integer.parseInt(id));
	}
	
	public Emp updateEmp(String id, Emp emp)
	{
		emp.setEmp_ID(Integer.parseInt(id));
		return empRepository.save(emp);
	}
	
	public List<Emp> fbLastNameAndAge(String name, int age) {
		return empRepository.findByLastNameAndAge(name, age);
	}

	public String getDept(String name) {
		
		System.out.println(name);
		Emp emp = empRepository.findByFirstName(name);
		System.out.println(emp.getEmp_ID());
		Dept dept = deptService.getDept(emp.getEmp_ID());
		System.out.println(dept.getName());
		return dept.getName();
	}
}
