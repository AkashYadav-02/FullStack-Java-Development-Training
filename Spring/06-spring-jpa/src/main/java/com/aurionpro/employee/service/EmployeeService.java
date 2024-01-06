package com.aurionpro.employee.service;

import java.util.List;
import java.util.Optional;

import com.aurionpro.employee.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int id);

	Employee save(Employee employee);

	void deleteById(int id);

	List<Employee> findEmployeeBySalaryGreaterThan(double salary);

	

}
