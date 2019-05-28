package com.example.demo.service;

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

}
