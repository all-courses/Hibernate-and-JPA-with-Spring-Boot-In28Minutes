package com.tp.jpademo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {
	@Id
	@GeneratedValue
	@Column(name = "course_id")
	long id;
	
	@Column(name = "course_name",length = 50,nullable = false)
	String fullName;

	public Course() {
		super();
	}

	public Course(long id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public Course(String fullName) {
		super();
		this.fullName = fullName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "\n Course [id=" + id + ", fullName=" + fullName + "]";
	}
	
	

}
