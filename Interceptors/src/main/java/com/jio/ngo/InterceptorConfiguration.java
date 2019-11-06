package com.jio.ngo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.jio.ngo.interceptor.PersonInterceptor;

@Configuration
public class InterceptorConfiguration extends WebMvcConfigurationSupport
{
	@Override
	protected void addInterceptors(InterceptorRegistry registry) 
	{
      registry.addInterceptor(new PersonInterceptor());
   }
}
