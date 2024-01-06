package com.aurionpro.test;

import com.aurionpro.model.*;

public class EmployeeTest {
	public static void main(String[] args) {

		IEmployee dev1 = new Developer("Akash", " Principle Engineer");
		IEmployee dev2 = new Developer("Yash", " Solution Architech");
		EmployeeDirectory devdir = new EmployeeDirectory("Developer");
		devdir.addEmployee(dev1);
		devdir.addEmployee(dev2);
		IEmployee manager1 = new Manager("Rohit Chandramaniya ", " Director");
		IEmployee manager2 = new Manager("Neerav Mody ", " Associate Manager");
		EmployeeDirectory manDir = new EmployeeDirectory("Manager");
		manDir.addEmployee(manager1);
		manDir.addEmployee(manager2);
//	  manDir.showEmployeeDetails();
		EmployeeDirectory companydir = new EmployeeDirectory(" AurionPro Employees");
		companydir.addEmployee(manDir);
		companydir.addEmployee(devdir);

		companydir.showEmployeeDetails();

	}
}
