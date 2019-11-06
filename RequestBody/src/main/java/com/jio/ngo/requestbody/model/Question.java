package com.jio.ngo.requestbody.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Question implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String questionMessage;
    private Date date;

}
