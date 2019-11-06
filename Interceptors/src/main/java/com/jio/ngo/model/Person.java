package com.jio.ngo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer personId;
	private String name;
	private Long ssn;

}
