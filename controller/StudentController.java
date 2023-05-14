package com.app.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.Student;
import com.app.service.StudentService;



@RestController
	@RequestMapping("/api/students")
	public class StudentController{
	    @Autowired
	    private StudentService studentService;

	    @GetMapping("/")
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId)
	            throws ResourceNotFoundException {
	        Student student = studentService.getStudentById(studentId);
	             //   .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
	        return ResponseEntity.ok().body(student);
	    }

//	    @PostMapping("/")
//	    public Student createStudent(@Valid @RequestBody Student student) {
//	        return studentService.deleteStudent(student);
//	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") Long studentId,
	            @Valid @RequestBody Student studentDetails) throws ResourceNotFoundException {
	        Student updatedStudent = studentService.updateStudent(studentId, studentDetails);
	               // .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
	        return ResponseEntity.ok(updatedStudent);
	    }

	    @DeleteMapping("/{id}")
	    public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") Long studentId)
	            throws ResourceNotFoundException {
					return null;
//	        studentService.deleteStudent(studentId)
//	                .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
	    
	    }
}
