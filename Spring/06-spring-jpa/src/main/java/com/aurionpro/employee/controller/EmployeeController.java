package com.aurionpro.employee.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.employee.entity.Employee;
import com.aurionpro.employee.exception.EmployeeNotFoundException;
import com.aurionpro.employee.exception.ExceptionResponse;
import com.aurionpro.employee.repository.EmployeeRepository;
import com.aurionpro.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService empservice;
     
	public EmployeeController(EmployeeService empservice) {
		super();
		this.empservice = empservice;
	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employeeList = this.empservice.findAll();
		return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity < Employee> findEmployeeById(@PathVariable int id) {
		Employee   tempEmployee = this.empservice.findById(id);
		
			return new ResponseEntity(tempEmployee, HttpStatus.OK);
	
	}

	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmployeee(@RequestBody Employee employee) {
		Employee tempEmployee = this.empservice.save(employee);
		return new ResponseEntity<Employee>(tempEmployee, HttpStatus.CREATED);
	}

	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployeee(@RequestBody Employee employee) {
		Employee tempEmployee = this.empservice.save(employee);
		return new ResponseEntity<Employee>(tempEmployee, HttpStatus.OK);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id) {
		
			this.empservice.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	
	}

//	@GetMapping("/employees/active")
//	public ResponseEntity<List<Employee>> getEmployeeById(
//			@RequestParam(required = false, defaultValue = "true") boolean active) {
//		List<Employee> empl;
//
//		if (active) {
//			System.out.println(active);
//			empl = this.empRepository.findAllActiveEmployee("yes");
//			return new ResponseEntity<List<Employee>>(empl, HttpStatus.OK);
//		} else {
//			System.out.println(active);
//			empl = this.empRepository.findAllActiveEmployee("No");
//			return new ResponseEntity<List<Employee>>(empl, HttpStatus.OK);
//		}
//
//	}
//	
//	@GetMapping("/employees/fname")
//	public ResponseEntity<List<Employee>> getEmployeeNyName(@RequestParam String name){
//		List<Employee> empl = this.empservice.findByName(name);
//		if (!empl.isEmpty()) {
//			return new ResponseEntity<List<Employee>>(empl,HttpStatus.OK);
//		} else {
//			throw new RuntimeException("Employee " + name + " as not found");
//		}
//	}
//		@GetMapping("/employees/email")
//		public ResponseEntity<List<Employee>> getEmployeeByemail(@RequestParam String name){
//			List<Employee> empl = this.empservice.findByEmail(name);
//			if (!empl.isEmpty()) {
//				return new ResponseEntity<List<Employee>>(empl,HttpStatus.OK);
//			} else {
//				throw new RuntimeException("Employee " + name + " as not found");
//			}
//		
//		
//		}
//		@GetMapping("/employees/salary")
//		public ResponseEntity<List<Employee>> getSalary(@RequestParam double salary){
//			List<Employee> empl = this.empservice.findEmployeeBySalaryGreaterThan(salary);
////			if (!empl.isEmpty()) {
//				return new ResponseEntity<List<Employee>>(empl,HttpStatus.OK);
////			 else {
////				throw new RuntimeException("Employee " + salary + " as not found");
////			}
		
		

//		@GetMapping("/employees/betweensalary")
//		public ResponseEntity<List<Employee>> getSalaryInBetween(@RequestParam double salary1 ,@RequestParam double salary2){
//			List<Employee> empl = this.empRepository.findSalaryBetween(salary1,salary2);
//			if (!empl.isEmpty()) {
//				return new ResponseEntity<List<Employee>>(empl,HttpStatus.OK);
//			} else {
//				throw new RuntimeException("Employee between " + salary1+salary2+ " as not found");
//			}
		
		

		
		
	
		
}
