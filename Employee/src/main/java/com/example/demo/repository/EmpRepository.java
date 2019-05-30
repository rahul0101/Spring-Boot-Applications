package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Emp;

public interface EmpRepository extends CrudRepository <Emp, Integer>{
	
	public List<Emp> findByLastNameAndAge(String lastName, int age);
	
	public Emp findByFirstName(String firstName);
	
	public List<Emp> findByCreatedtimeBefore(Date date);
	
	public List<Emp> findByCreatedtimeAfter(Date date);
	
	//public List findByLastName (String lastName, int age);
}
