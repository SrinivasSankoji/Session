package com.jio.ngo.connection.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import com.jio.ngo.connection.model.Student;

public class ConnectionDaoImpl implements ConnectionDao
{

	
	
	@Override
	public List<Student> findAll() 
	{
		String hql="SELECT STUDENTID, FIRSTNAME,LASTNAME,EMAIL FROM STUDENT";
		RowMapper<Student> rowMapper=new BeanPropertyRowMapper<Student>(Student.class);
		return null;
	}

}
