package com.ebit.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.rest.model.Student;
import com.ebit.rest.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public Student createStudent(Student stud) {
		return repo.save(stud);
	}
	
	public List<Student> findAllStudent()
	{
		return repo.findAll();
	}
	
	public Optional<Student> findById(int id)
	{
		return repo.findById(id);
	}
}
