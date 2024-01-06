package com.aurionpro.studentapp.service;

import java.util.List;
import java.util.Optional;

import com.aurionpro.studentapp.entity.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int id);

	Student save(Student student);

	void deleteById(int id);

	

}
