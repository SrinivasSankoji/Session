package com.jio.ngo.responsebody.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.jio.ngo.requestbody.controller.RequestBodyController;
import com.jio.ngo.requestbody.model.Answer;

@ControllerAdvice
public class CustomResponseBodyAdvice implements ResponseBodyAdvice<Answer>
{

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) 
	{
		System.out.println("In supports() Method of " + getClass().getSimpleName());
        return returnType.getContainingClass() == RequestBodyController.class 
		&& returnType.getParameterType() == Answer.class;
	}
	
	@Override
	public Answer beforeBodyWrite(Answer answer, MethodParameter returnType, 
			MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) 
	{
		 System.out.println("In BeforeBodyWrite() Method of " + getClass().getSimpleName());
	     answer.setAnswerMessage(answer.getAnswerMessage() + " by Spring");
	     return answer;
	}
}
