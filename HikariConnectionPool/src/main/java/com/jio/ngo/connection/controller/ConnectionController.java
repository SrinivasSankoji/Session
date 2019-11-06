package com.jio.ngo.connection.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionController 
{
	
	@Autowired
	DataSource dataSource;
	
	

}
