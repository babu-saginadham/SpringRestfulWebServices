package com.student.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student/")
public class StudentController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		String result="TEST URI ";  
		return result;
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		String result="TEST2 URI ";  
		return result;
	}
	
	@RequestMapping(value = "/student/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		String result="Hello "+name;  
		return result;
	}
	
}