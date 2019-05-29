package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dept;
import com.example.demo.repository.DeptRepository;

@Service
public class DeptService {
	
	@Autowired
	private DeptRepository deptRepository;
	
	public Dept getDept(int id) {
		System.out.println("lol");
		return deptRepository.findByEid(id);
	}

}
