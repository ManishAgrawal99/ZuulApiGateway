package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class CommonController {
	
	
	@RequestMapping("/echoStudentName/{name}")
	public String echoStudentName(@PathVariable("name") String name) {
		return "Hello "+ name + " " + new Date();
	}
	
	@RequestMapping("/getStudentDetails/{name}")
	public Student getStudentDetails(@PathVariable("name") String name) {
		return new Student(name, "Mumbai", "A+");
	}
	
	
}
