package com.aurionpro.service;

import java.util.List;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.aurionpro.dto.StudentPageResponseDto;
import com.aurionpro.entity.Student;
import com.aurionpro.exception.StudentNotFoundException;
import com.aurionpro.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

//	@Override
//	public List<Student> findAll() {
//		// TODO Auto-generated method stub
//		List<Student> studentList = this.studentRepository.findAll();
//		return studentList;
//	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		this.studentRepository.deleteById(id);
		
	}

	@Override
	public Student save(Student studentParam) {
		// TODO Auto-generated method stub
		return this.studentRepository.save(studentParam);	
		}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Student student = this.studentRepository.findById(id).orElseThrow(() -> {
			throw new StudentNotFoundException("Student not found with ID :" + id);
		});
		return student;
	}

	@Override
	public List<Student> findAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		Page<Student> page = this.studentRepository.findAll(pageable);
		List<Student> studentList = page.getContent();
		StudentPageResponseDto response = new StudentPageResponseDto();
		response.setContent(studentList);
		response.setElementsOnPage(page.getNumberOfElements());
	    response.setTotalPages(page.getTotalPages());
	    response.setHasNext(page.hasNext());
	    response.setHasPrevious(page.hasPrevious());
	    response.setCurrentPageNumber(page.getNumber());
	    response.setTotalElements(page.getTotalElements());

		return studentList;
	}

	@Override
	public StudentPageResponseDto findAll(int pageNo, int pageSize, String sortBy, String sortDir) {
		// TODO Auto-generated method stub
		   String dir = Sort.Direction.ASC.name();
		    boolean result = sortDir.equalsIgnoreCase(dir);
		    Sort sort = null;
		    if (result) {
		      sort = Sort.by(sortBy).ascending();
		    } else {
		      sort = Sort.by(sortBy).descending();
		    }
		   Pageable pageable = PageRequest.of(pageNo, pageSize,sort);

		    Page<Student> page = this.studentRepository.findAll(pageable);

		    List<Student> studentList = page.getContent();

		    StudentPageResponseDto response = new StudentPageResponseDto();

		    response.setContent(studentList);
		    response.setElementsOnPage(page.getNumberOfElements());
		    response.setTotalPages(page.getTotalPages());
		    response.setHasNext(page.hasNext());
		    response.setHasPrevious(page.hasPrevious());
		    response.setCurrentPageNumber(page.getNumber());
		    response.setTotalElements(page.getTotalElements());
		    return response;
	}


//	@Override
//	public Student addCourseToStudent(int studentId, int courseId) {
//		// TODO Auto-generated method stub
//		Optional<Student> optionalStudent = this.studentRepository.findById(studentId);
//		if(optionalStudent.isPresent()) {
//			Student student = optionalStudent.get();//optionalStudent.get();
//			Optional<Course> optionalCourse = this.courseRepository.findById(courseId);
//			if(optionalCourse.isPresent()) {
//				Course course = optionalCourse.get();
//				List<Course> courses = student.getCourses();
//				courses.add(course);
//				this.studentRepository.save(student);
//				return student;
//			}
//			else {
//				throw new CourseNotFoundException("Course not found with ID :"+courseId );
//			}
//			
//		}
//		else {
//			throw new StudentNotFoundException("Student not found with ID :"+studentId );
//		}
//	}

}

