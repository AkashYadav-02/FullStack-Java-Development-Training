package com.aurionpro.repository;

import java.util.List;

import com.aurionpro.employee.entity.Employee;



public class EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
