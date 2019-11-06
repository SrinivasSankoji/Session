package com.jio.ngo.connection.dao;

import java.util.List;

import com.jio.ngo.connection.model.Student;

public interface ConnectionDao 
{
	List<Student> findAll();
}
