package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Course extends JpaRepository<Course, Long> {

	    // Add custom methods as needed for your project
	    List<Course> findByTitleContaining(String keyword);


	    List<Course> findByStudentsNotContains(Student student);


		void setName(String name);


		void setDescription(String description);


		void setCredits(int credits);


		void setDepartment(String department);

	

}
