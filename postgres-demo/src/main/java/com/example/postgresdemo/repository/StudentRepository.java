package com.example.postgresdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.postgresdemo.model.Student;

public interface StudentRepository extends CrudRepository<Student, String>{
	
}
