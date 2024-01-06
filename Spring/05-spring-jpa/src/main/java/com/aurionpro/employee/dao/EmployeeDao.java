package com.aurionpro.employee.dao;

import java.util.List;

import com.aurionpro.employee.entity.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(int id);
	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee empl);

	public Employee deleteEmployee(int id);

	public List<Employee> getActiveEmployees(String value);

	public List<Employee> getEmployeeById(String name);

}
