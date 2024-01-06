package com.aurionpro.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	 //List<Student> findAll(Pageable pageable);

}
