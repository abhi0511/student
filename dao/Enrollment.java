package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface Enrollment extends JpaRepository<Enrollment, Long> {

	    // Add custom methods as needed for your project
	    List<Enrollment> findByStudent(Student student);

	    List<Enrollment> findByCourse(Course course);

	    Optional<Enrollment> findByStudentAndCourse(Student student, Course course);

	}


