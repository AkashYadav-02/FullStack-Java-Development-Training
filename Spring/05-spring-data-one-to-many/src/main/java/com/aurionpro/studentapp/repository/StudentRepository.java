package com.aurionpro.studentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.studentapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
//	List<Student> findByActive(boolean active);
	List<Student> findTop1ByFirstName(String firstName);
	
//	@Query("select e from Student e where e.email=?1")
//	List<Student> findEmployeeByEmployeeEmail(String email);
	
//	List<Student> findEmployeeBySalaryGreaterThanEqual(double salary);
	
//	List<Student> findEmployeeBySalaryBetween(double salary1,double salary2);
	
	
}
