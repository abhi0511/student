package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	
	@Id
	@Column
   int	id;
	
	@Column
	String name;
	
	@Column
	String description;
	
	@Column
	int Credits;
	@Column
	String department;
	public Course(int id, String name, String description, int credits, String department) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		Credits = credits;
		this.department = department;
	}
	public Course() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int credits) {
		Credits = credits;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Object getStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
