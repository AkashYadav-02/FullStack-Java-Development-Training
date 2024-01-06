package com.aurionpro.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.dto.StudentPageResponseDto;
import com.aurionpro.entity.Student;
import com.aurionpro.service.StudentService;

@RestController
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

//	@GetMapping("/students")
//	public ResponseEntity<List<Student>> getAllStudents() {
//		List<Student> studentList = this.studentService.findAll();
//		return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
//	}

	@DeleteMapping("/students/{id}")
	public ResponseEntity<HttpStatus> deleteVideo(@PathVariable int id) {
		this.studentService.deleteById(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student studentParam) {
		Student student = this.studentService.save(studentParam);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentbyId(@PathVariable int id) {
		Student student = this.studentService.findById(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
//	@PutMapping("/students/{studentId}/course/{courseId}")
//	public ResponseEntity<Student> addCourseToStudent(@PathVariable (name="studentId") int studentId, @PathVariable (name="courseId") int courseId){
//		Student student = this.studentService.addCourseToStudent(studentId, courseId);
//		return new ResponseEntity<Student>(student, HttpStatus.OK);
//	}
//	@GetMapping("/student/between")
//    public ResponseEntity<List<Student>> paginateStudents(@RequestParam int start ,@RequestParam int end ) {
//       
//    	List<Student> stu =this.studentService.findDataInBetween(start,end);	
//		return new ResponseEntity<List<Student>>(stu ,HttpStatus.OK);
//      
//    }

	
//	@GetMapping("/students")
//	public ResponseEntity<List<Student>> getAllStudent(
//			@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
//			@RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize,
//			@RequestParam(value = "sortBy",defaultValue = "id",required = false) String sortBy,
//		    @RequestParam(value = "sortDir",defaultValue = "asc",required = false) String sortDir
//		      )
//			
//	{
//		System.out.println(pageNo + " " + pageSize);
//		List<Student> studentList = this.studentService.findAll(pageNo, pageSize);
//		
//		return new ResponseEntity<List<Student>>(studentList ,HttpStatus.OK);
//		
//		
//		    
//		
//	}
	@GetMapping("/students")
	public ResponseEntity<StudentPageResponseDto> getAllStudent(
			@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize,
			@RequestParam(value = "sortBy",defaultValue = "id",required = false) String sortBy,
		    @RequestParam(value = "sortDir",defaultValue = "asc",required = false) String sortDir
	      )
			
	{
	StudentPageResponseDto studentList = this.studentService.findAll(pageNo,pageSize,sortBy,sortDir);
    return new ResponseEntity<StudentPageResponseDto>(studentList, HttpStatus.OK);
	}
}
