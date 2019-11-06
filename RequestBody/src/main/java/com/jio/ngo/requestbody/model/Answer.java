package com.jio.ngo.requestbody.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Answer implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String answerMessage;
    private Question question;

}
