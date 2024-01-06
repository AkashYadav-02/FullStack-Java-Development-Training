package com.aurionpro.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.employee.entity.Employee;
import com.aurionpro.repository.EmployeeRepository;



@RestController
public class EmployeeController {

	private EmployeeRepository empRepository;

	public EmployeeController(EmployeeRepository empRepository) {
		super();
		this.empRepository = empRepository;
	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employeeList = this.empRepository.findAll();
		return new ResponseEntity<List<Employee>>(employeeList,HttpStatus.OK);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable int id){
		Optional<Employee> optionalEmployee = this.empRepository.findById(id);
		if(optionalEmployee.isPresent()) {
			return new ResponseEntity<Employee>(optionalEmployee.get(),HttpStatus.OK);
		}
		else {
			throw new RuntimeException("Employee with id "+id+" as not found");
		}
	}
	
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmployeee(@RequestBody Employee employee){
		Employee tempEmployee = this.empRepository.save(employee);
		return new ResponseEntity<Employee>(tempEmployee,HttpStatus.CREATED);
	}
	
	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployeee(@RequestBody Employee employee){
		Employee tempEmployee = this.empRepository.save(employee);
		return new ResponseEntity<Employee>(tempEmployee,HttpStatus.OK);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id){
		if(this.empRepository.existsById(id)) {
			this.empRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
	

}
