package com.jio.ngo.requestbody.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jio.ngo.requestbody.model.Answer;
import com.jio.ngo.requestbody.model.Question;

@RestController
public class RequestBodyController 
{
	 @PostMapping(value = "/ask", 
	 consumes = MediaType.APPLICATION_JSON_VALUE, 
	 produces = MediaType.APPLICATION_JSON_VALUE)
	 public Answer ask(@RequestBody Question question) 
	 {
	        System.out.println("In Controller Method");
	        Answer answer = new Answer();
	        answer.setAnswerMessage("I don't know!");
	        answer.setQuestion(question);
	        return answer;
	 }
}
