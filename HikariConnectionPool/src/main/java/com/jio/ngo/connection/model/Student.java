package com.jio.ngo.connection.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String email;

}
