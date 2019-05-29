package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Dept;

public interface DeptRepository extends CrudRepository<Dept, Integer> {
	
	public Dept findByEid(int id);
}
