package com.techlabs.controller;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.techlabs.entity.Student;
import com.techlabs.exception.NoStudentRecordFoundException;
import com.techlabs.service.StudentService;

@RestController
@RequestMapping("  ")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> findAllStudents() {
		List<Student> studentList = studentService.findAll();
		if (studentList.size() == 0) {
			throw new NoStudentRecordFoundException("No record was found...");
		}
		return new ResponseEntity<>(studentList, HttpStatus.OK);
//		return repository.findAllStudents();
//		return studentService.findAll();

	}

	@GetMapping("/students/{sid}")
	public ResponseEntity<Student> findStudent(@PathVariable(name = "sid") Long id) {
		Student student = studentService.findById(id);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@PostMapping("/students")
//	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Student> saveStudent(@RequestBody Student stud) {
		stud.setId(0L); // to avoid update if we mistakenly give id in postman while adding student
		Student student = studentService.save(stud);
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}

	@PostMapping("/students/all")
//	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<Student>> saveAllStudent(@RequestBody List<Student> studentList) {
		List<Student> student = studentService.saveAll(studentList);
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}

	@PutMapping("/students")
//	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Student> updateStudent(@RequestBody Student stud) {
		Student student = studentService.save(stud);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@DeleteMapping("/students/{sid}")
//	@PreAuthorize("hasRole('ADMIN')")
	private ResponseEntity<HttpStatus> deleteStudentById(@PathVariable(name = "sid") Long id) {
		studentService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/students/{pageNumber}/{pageSize}", method = RequestMethod.GET)
	public Page<Student> studentPagination(@PathVariable int pageNumber, @PathVariable int pageSize) {
		return studentService.getStudentPagination(pageNumber, pageSize);
	}

	@RequestMapping(value = "/students/{pageNumber}/{pageSize}/{sortProperty}", method = RequestMethod.GET)
	public Page<Student> studentPagination(@PathVariable int pageNumber, @PathVariable int pageSize,
			@PathVariable String sortProperty) {
		return studentService.getStudentPaginationInSort(pageNumber, pageSize, sortProperty);
	}
	// @DeleteMapping("/students")
	// private void deleteAllStudents() {
	// studentService.deleteAll();
	//
	// }

//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
//
//		// create a Student Error Message
//		StudentErrorResponse error = new StudentErrorResponse();
//
//		error.setStatus(HttpStatus.NOT_FOUND.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//
//		// return ResponseEntity
//
//		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//	}
//
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
//
//		// create a Student Error Message
//		StudentErrorResponse error = new StudentErrorResponse();
//
//		error.setStatus(HttpStatus.BAD_REQUEST.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//
//		// return ResponseEntity
//
//		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//	}
//	
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(NoStudentRecordFoundException exc) {
//
//		// create a Student Error Message
//		StudentErrorResponse error = new StudentErrorResponse();
//
//		error.setStatus(HttpStatus.NOT_FOUND.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//
//		// return ResponseEntity
//
//		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//	}
}