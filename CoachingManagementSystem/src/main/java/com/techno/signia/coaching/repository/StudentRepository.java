package com.techno.signia.coaching.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techno.signia.coaching.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
