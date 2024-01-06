package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.dto.StudentPageResponseDto;
import com.aurionpro.entity.Student;


public interface StudentService {

//	public List<Student> findAll();

	public void deleteById(int id);

	public Student save(Student studentParam);

	public Student findById(int id);

	public List<Student> findAll(int pageNo, int pageSize);

	public StudentPageResponseDto findAll(int pageNo, int pageSize, String sortBy, String sortDir);

	//public Student addCourseToStudent(int studentId, int courseId);

	//public List<Student> findDataInBetween(int start, int end);

}
