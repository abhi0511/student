package com.app.service;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.Student;
import com.app.dao.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) throws ResourceNotFoundException {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

   

    public Student updateStudent(Long id, Student studentDetails) throws ResourceNotFoundException {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
//
//        student.setName(studentDetails.getName());
//        student.setEmail(studentDetails.getEmail());
//        student.setAddress(studentDetails.getAddress());

        return studentRepository.save(student);
    }

//    public void deleteStudent(@Valid Student student2) throws ResourceNotFoundException {
//       // Student student = studentRepository.deleteById(student)
//                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + student2));
//
//        studentRepository.delete(student);
//    }

	public List<Student> getAllStudents1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student createStudent(@Valid Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}

