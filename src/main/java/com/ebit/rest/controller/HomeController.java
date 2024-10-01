package com.ebit.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.rest.model.Student;
import com.ebit.rest.service.StudentService;

import jakarta.annotation.PostConstruct;

@RestController
public class HomeController {

	@Autowired
	private StudentService StudentService;
	
	@GetMapping("status")
	public String status()
	{
		return "running...";
	}
	
	@PostMapping("save")
	public Student createStudent(@RequestBody Student student) {
		return StudentService.createStudent(student);
	}
	
	@GetMapping("get")
	public List<Student> findAllStudent()
	{
		 return StudentService.findAllStudent();
	}
	
	@GetMapping("/{id}")
	public Optional<Student> findById(@PathVariable int id)
	{
		return StudentService.findById(id);
	}
	
}
