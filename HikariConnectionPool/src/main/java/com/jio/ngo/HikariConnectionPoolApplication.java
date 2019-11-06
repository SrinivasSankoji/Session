package com.jio.ngo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HikariConnectionPoolApplication 
{
	@Autowired
	DataSource dataSource;

	public static void main(String[] args) 
	{
		SpringApplication.run(HikariConnectionPoolApplication.class, args);
	}
	
	 public void run(String... args) throws Exception 
	 {
        System.out.println("DATASOURCE = " + dataSource);
	 }
}
