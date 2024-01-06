 package com.aurionpro.employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aurionpro.employee.entity.Employee;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	private EntityManager manager;

	public EmployeeDaoImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Query q = this.manager.createQuery("select s from Employee s");
		List<Employee> empl = q.getResultList();
		return empl;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
			Employee emp = this.manager.find(Employee.class, id);
			return emp;
		
	}

	@Override
	public Employee addEmployee(Employee employee) {
		   this.manager.persist(employee);
		   return employee;
	}

	@Override
	public Employee updateEmployee(Employee empl) {
//		System.out.println(empl);
//		Employee temp =getEmployeeById(empl.getId());
//		temp.setFirstName(empl.getFirstName());
//		temp.setEmail(empl.getFirstName());
//		temp.setActive(empl.getActive());
//		temp.setSalary(empl.getSalary());
		
		this.manager.merge(empl);
		return empl;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		 Employee temp= this.manager.find(Employee.class,id);
		 this.manager.remove(temp);
		 
		return temp;
	}
	@Override
	public List<Employee> getActiveEmployees(String value) {
		Query q = this.manager.createQuery("SELECT e FROM Employee e WHERE e.active = :isActive");
		q.setParameter("isActive", value);
			List<Employee> empl = q.getResultList();
			return empl;
		}

	
	@Override
	public List<Employee> getEmployeeById(String name) {
		
		Query q = this.manager.createQuery("SELECT e FROM Employee e WHERE e.firstName = :name");
		q.setParameter("name",  name);
			List<Employee> empl = q.getResultList();
			return empl;
	}
	
	
}



	
	

