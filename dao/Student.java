package com.app.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.pojo.Course;



	public interface Student extends JpaRepository<Student, Long> {

	    // Add custom methods as needed for your project
	    List<Student> findByFirstName(String firstName);

	    List<Student> findByLastName(String lastName);

	

	    List<Student> findByCoursesIn(Collection<Course> courses);

		Student orElseThrow(Object object);

	}


