package com.aurionpro.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aurionpro.employee.exception.EmployeeNotFoundException;
import com.aurionpro.employee.exception.InvalidUpdateException;
import com.aurionpro.employee.repository.EmployeeRepository;
import com.aurionpro.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employeeList = this.employeeRepository.findAll();
		
		return employeeList;
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> optionalEmployee = this.employeeRepository.findById(id);
		if(optionalEmployee.isPresent()) {
			return optionalEmployee.get();
		}
		throw new EmployeeNotFoundException("Employee not found, ID :"+id);
}

	@Override
	public Employee save(Employee employee) {
		if(employee.getId()!=0) {
			if(this.employeeRepository.existsById(employee.getId())) {
				return this.employeeRepository.save(employee);
			}
			else {
				throw new InvalidUpdateException("Yaar akash tumhe ye id sahi lagra h muje toh nahi lagra you are keeping us in dark sahil notebook krlo yaar, ID :"+employee.getId());
			}
		}
		return this.employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int id) {
		if(this.employeeRepository.existsById(id)) {
			this.employeeRepository.deleteById(id);
		}
		else {
			throw new EmployeeNotFoundException("Employee not found, ID :"+id);
		}
	}

	@Override
	public List<Employee> findEmployeeBySalaryGreaterThan(double salary) {
		// TODO Auto-generated method stub
		
		List<Employee> emp=this.employeeRepository.findEmployeeBySalaryGreaterThan(salary);
		if(!emp.isEmpty()) {
			return emp;
		}
		else {
			throw new EmployeeNotFoundException("Employee not found, ID :"+salary);
		}
		
	}
	
	

}
