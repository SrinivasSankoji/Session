package com.jio.ngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jio.ngo.model.Person;
import com.jio.ngo.service.PersonService;

@RestController
@RequestMapping("/search")
public class InterceptorController 
{
	
	@Autowired
	private PersonService personService;

	@RequestMapping("/person")
	public Person searchStudent(@RequestParam(name = "personId", required = true) 
				Integer personId) 
	{
		Person person = personService.getPersonById(personId);
		return person;
	}
	
}
