package com.example.postgresdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.postgresdemo.model.ReputationEmployee;

public interface ReputationEmpoyeeRepository extends CrudRepository<ReputationEmployee, String>{
	
}
