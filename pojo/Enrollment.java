package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String course;

    // Define one-to-one relationship with Student entity
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Constructors, getters, and setters
    public Enrollment() {}

    public Enrollment(String course, Student student) {
        this.course = course;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", course=" + course + ", student=" + student + "]";
	}
    
    
}

