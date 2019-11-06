package com.jio.ngo.ehcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jio.ngo.cache.service.CacheService;
import com.jio.ngo.ehcache.model.Student;

@RestController
@RequestMapping("/student")
public class CacheController 
{
	@Autowired
	private CacheService cacheService;

	@GetMapping
	public ResponseEntity<Student> fetchStudent(@RequestParam(name = "studentId") String studentId,
			@RequestParam(name = "isCacheable") boolean isCacheable) throws InterruptedException {
		return new ResponseEntity<>(cacheService.fetchStudent(studentId,isCacheable).get(), HttpStatus.OK);
	}

}
