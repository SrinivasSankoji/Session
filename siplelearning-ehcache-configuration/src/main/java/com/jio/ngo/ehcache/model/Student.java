package com.jio.ngo.ehcache.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String id;
	private String firstName;
	private String lastName;
	private String age;
	private Address address;
	private Major major;
	
	
	public Student(String id, String firstName, String lastName, String age, Address address, Major major) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.major = major;
	}
}
