package com.example.postgresdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Student;
import com.example.postgresdemo.repository.StudentRepository;

@RestController
public class WebController {
	@Autowired
	StudentRepository repository;

	@RequestMapping("/save")
	public String process() {
		// save a single Customer
		repository.save(new Student("001", "Jack", "Smith"));
		return "Done";
	}

	@GetMapping("/getStudentName")
	public String getStudent(@RequestParam("id") String id) {
		Optional<Student> findbyid = repository.findById(id);
		Student student = findbyid.get();
		return student.getName();
	}
}
