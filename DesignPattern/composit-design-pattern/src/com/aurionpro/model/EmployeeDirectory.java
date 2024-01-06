package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee {

	private List<IEmployee> employees;
	private String dirName;

	public EmployeeDirectory(String dir) {
		this.dirName = dir;
		this.employees = new ArrayList<IEmployee>();
	}

	public void addEmployee(IEmployee employee) {
		this.employees.add(employee);
	}

	public void removeEmployee(IEmployee employee) {
		if (employee instanceof IEmployee) {
			this.employees.forEach(empl -> {
				empl.showEmployeeDetails();
			});
		}
	}

	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println(" \n**************************\n" + this.dirName + ":\n ");
		this.employees.forEach(empl -> {
			empl.showEmployeeDetails();
		});

	}

}
