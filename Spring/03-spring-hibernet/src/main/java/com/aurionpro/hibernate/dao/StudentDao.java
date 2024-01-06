package com.aurionpro.hibernate.dao;

import java.util.List;

import com.aurionpro.hibernate.entity.Student;

public interface StudentDao {
 public void  addStudent(Student student);
 public void  updateStudent(Student std );
 public Student findById(int id);
 public List<Student> findByFirstName(String fname);
 public void  deleteStudentById(int id );
 public List<Student> findAll();
}
