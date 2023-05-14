package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.CourseRepository;
import com.app.pojo.Course;



@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<com.app.dao.Course> getAllCourses() {
		return courseRepository.findAll();
	}
	
	public com.app.dao.Course getCourseById(int courseId) {
		Optional<com.app.dao.Course> course = courseRepository.findById(courseId);
		if(course.isPresent()) {
			return course.get();
		} else {
			throw new ResourceNotFoundException("Course not found with id: " + courseId);
		}
	}
	
	public List<com.app.dao.Course> addCourse(Course course) {
		return courseRepository.findAll();
	}
	
	public com.app.dao.Course updateCourse(int courseId, Course courseDetails) {
		com.app.dao.Course course = getCourseById(courseId);
		
		course.setName(courseDetails.getName());
		course.setDescription(courseDetails.getDescription());
		course.setCredits(courseDetails.getCredits());
		course.setDepartment(courseDetails.getDepartment());
		
		return courseRepository.save(course);
	}
	
	public void deleteCourse(int courseId) {
		com.app.dao.Course course = getCourseById(courseId);
		courseRepository.delete(course);
	}

}
