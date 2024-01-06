package com.aurionpro.hibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aurionpro.hibernate.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	private EntityManager manager;

	public StudentDaoImpl(EntityManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		this.manager.persist(student);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Student std = this.manager.find(Student.class, id);
		return std;
	}

	@Override
	public void updateStudent(Student std) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
//			Student std=findById(1);
//			  std.setFirstName("Yash");
//			  std.setLastName("Shinde");
//			  std.setEmail("yash@gmail.com");

		Student temp = this.manager.merge(std);
		System.out.println(temp);

	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		Query q = this.manager.createQuery("select s from Student s");
		List<Student> std = q.getResultList();
		return std;
	}

	@Override
	public List<Student> findByFirstName(String fname) {
		Query q = this.manager.createQuery("SELECT s FROM Student s WHERE s.firstName = :firstName");
		q.setParameter("firstName", fname);

		List<Student> std = q.getResultList();
//			List<Student>std=q.getResultList();

		return std;
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		Student std = this.manager.find(Student.class, id);
		
		this.manager.remove(std);
		System.out.println("data deleted:"+std);
		
	}

}
