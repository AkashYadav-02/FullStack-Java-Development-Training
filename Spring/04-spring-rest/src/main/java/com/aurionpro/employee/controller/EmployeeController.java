package com.aurionpro.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.employee.dao.EmployeeDao;
import com.aurionpro.employee.entity.Employee;

@RestController

public class EmployeeController {
	
	private EmployeeDao empldao;

	public EmployeeController(EmployeeDao empldao) {
		super();
		this.empldao = empldao;
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		List<Employee> empl=this.empldao.getAllEmployee();	
		return  empl;
		
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById( @PathVariable int id){
	Employee  empl=this.empldao.getEmployeeById(id);
		
		return  empl;
		
	}
	@PostMapping("/employees")
	public Employee addEmployee( @RequestBody Employee empl){
	 Employee empl1=this.empldao.addEmployee(empl);
		
		return  empl1;
		
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee empl) {
		 Employee empl1=this.empldao.updateEmployee(empl);
			
			return  empl1;
	}
	@DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
		   Employee temp=this.empldao.deleteEmployee(id);
		  
		  return    temp+"is deleted";
	}
	
	@GetMapping("/employees/active")
	public List<Employee> getEmployeeById( @RequestParam boolean value){
		List<Employee>  empl;
		System.out.println(value);
		if(value) {
		 empl=this.empldao.getActiveEmployees("yes");
		}
		else {
			  empl=this.empldao.getActiveEmployees("No");
		}

		
		return  empl;
		
	}
	@GetMapping("/employees/find")
	public List<Employee> getEmployeeById( @RequestParam String  name){
		List<Employee>  empl= this.empldao.getEmployeeById(name);
		
		
		
		return  empl;
		
	}

}
