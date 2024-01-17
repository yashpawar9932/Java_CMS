package com.techno.signia.coaching.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techno.signia.coaching.entity.Student;
import com.techno.signia.coaching.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/save")
	private Student saveStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@GetMapping("/find/{id}")
	private Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@GetMapping("/findAll")
	private List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	
}
