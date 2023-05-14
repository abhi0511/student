package com.app.controller;

import java.util.List;

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

import com.app.pojo.Course;
import com.app.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get all courses
    @GetMapping("")
    public List<com.app.dao.Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Get course by ID
  @GetMapping
    public com.app.dao.Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    // Create course
    @PostMapping("")
    public List<com.app.dao.Course> createCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // Update course by ID
    @PutMapping("/{id}")
    public com.app.dao.Course updateCourse(@PathVariable int id, @Valid @RequestBody Course course) {
        return courseService.updateCourse(id, course);
    }

    // Delete course by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
        return ResponseEntity.ok().build();
    }
}
