package com.jio.ngo.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.jio.ngo.model.Person;

@Service
public class PersonService 
{
	private static Map<Integer,Person> personDB;

	@PostConstruct
	public void init() throws Exception 
	{
		personDB = new HashMap<Integer,Person>();
		for (int i = 0; i < 100; i++) 
		{
			Person person = new Person(i, "Person-name-" + i, System.currentTimeMillis());
			personDB.put(i, person);
		}
	}

	public Person getPersonById(int id) {
		return personDB.get(id);
	}
	

}
