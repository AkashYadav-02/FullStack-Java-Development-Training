package com.aurionpro;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aurionpro.hibernate.dao.StudentDao;
import com.aurionpro.hibernate.entity.Student;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private StudentDao studentdao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		addStudent();
	//findStudent();
//	updateStudent();
//		findAllStudent();
//		findByFirstName();
		deleteByid();
	}

	private void deleteByid() {
		// TODO Auto-generated method stub
	   this.studentdao.deleteStudentById(1);
		
	}

	private void findByFirstName() {
		// TODO Auto-generated method stub
		
		List<Student> std=studentdao.findByFirstName("Akash");
		std.forEach(value -> System.out.println(value));

	}

	private void updateStudent() {
		// TODO Auto-generated method stub
	Student student=studentdao.findById(1) ;
	System.out.println(student);
	student.setFirstName("Akash");
  student.setLastName("Shinde");
  student.setEmail("yash@gmail.com");
  
    studentdao.updateStudent(student);
	
	}
	
	private void findAllStudent() {
		List<Student> std=studentdao.findAll();
		std.forEach(value -> System.out.println(value));
	}

	  
	private void findStudent() {
		
		System.out.println(studentdao.findById(1) );
		
	}

	private void addStudent() {
		// TODO Auto-generated method stub
		Student student = new Student("Akash", "Yadav", "akash@gmail.com");

		studentdao.addStudent(student);
	}

}
