package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Emp;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;
	
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
}
