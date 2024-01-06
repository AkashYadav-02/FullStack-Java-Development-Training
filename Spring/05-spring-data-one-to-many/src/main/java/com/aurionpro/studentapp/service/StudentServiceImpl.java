package com.aurionpro.studentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aurionpro.studentapp.entity.Student;
import com.aurionpro.studentapp.exception.StudentNotFoundException;
//import com.aurionpro.studentapp.exception.EmployeeNotFoundException;
import com.aurionpro.studentapp.exception.invalidupdateInvalidUpdateException;
import com.aurionpro.studentapp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> findAll() {
		List<Student> studentList = this.studentRepository.findAll();
		return studentList ;
	}

	@Override
	public Student findById(int id) {
		Optional<Student> optionalstudent= this.studentRepository.findById(id);
		if(optionalstudent.isPresent()) {
			return optionalstudent.get();
		}
		throw new StudentNotFoundException("Please enter valid id Student not found, ID :"+id );
	}

	@Override
	public Student save(Student student) {
		if(student.getId()!=0) {
			if(this.studentRepository.existsById(student.getId())) {
				return this.studentRepository.save(student);
			}
			else {
				throw new invalidupdateInvalidUpdateException("InvalidUpdate, ID :"+student.getId());
			}
		}
		return this.studentRepository.save(student);
	}

	@Override
	public void deleteById(int id) {
		if(this.studentRepository.existsById(id)) {
			this.studentRepository.deleteById(id);
		}
		else {
			throw new StudentNotFoundException("Employee not found, ID :"+id);
		}
	}


	

}
