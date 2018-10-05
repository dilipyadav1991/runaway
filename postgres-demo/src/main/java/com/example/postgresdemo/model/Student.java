package com.example.postgresdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	public Student(){}
	
	public Student(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName(){
		return firstName + " " + lastName;
	}
}
