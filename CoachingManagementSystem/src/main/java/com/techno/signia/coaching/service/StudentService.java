package com.techno.signia.coaching.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.signia.coaching.entity.Student;
import com.techno.signia.coaching.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	public Student createStudent(Student student) {
		return repository.save(student);
	}
	
	public Student getStudentById(int id) {
		return repository.findById(id).get();
	}
	
	public List<Student> getAllStudents(){
		return repository.findAll();
	}
	
	public String deleteStudent(int id) {
		repository.deleteById(id);
		return "Deletion Successful";
	}
	
public Student updateStudent(Student correctStudent, int id) {
		
		Student student = repository.findById(id).get();
		
		if(student.getName()!=null) {
			student.setName(correctStudent.getName());
		}
		if(student.getAddress()!=null) {
			student.setAddress(correctStudent.getAddress());
		}
		return repository.save(student);
	}

}
