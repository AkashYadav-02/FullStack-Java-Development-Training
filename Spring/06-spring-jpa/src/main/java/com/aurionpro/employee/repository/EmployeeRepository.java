package com.aurionpro.employee.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aurionpro.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
     
	@Query("select e from Employee e where e.active=?1")
	public List<Employee> findAllActiveEmployee(String  value);
	
	@Query("select e from Employee e where e.firstName=?1")
	public List<Employee> findByName(String name);

	public List<Employee> findByEmail(String name);
	
	@Query("select e from Employee e where e.salary>?1")
	public List<Employee> findBySalary(double salary);
	
	@Query("select e from Employee e where e.salary>?1 and e.salary<?2 ")
	public List<Employee> findSalaryBetween(double salary1, double salary2);
	public List<Employee>  findEmployeeBySalaryGreaterThan(double sal); 

}



