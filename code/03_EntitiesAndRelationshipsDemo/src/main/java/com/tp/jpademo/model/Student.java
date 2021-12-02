package com.tp.jpademo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "stud_id")
	long id;
	
	@Column(name = "stud_fullname",length = 30,nullable = false)
	String fullName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PassportId")
	private Passport passport;
	
	@ManyToMany(mappedBy = "students")
	private List<Course> courses=new ArrayList<>();
	
	public List<Course> getCourses() {
		return courses;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Student() {
		super();
	}

	public Student(long id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public Student(String fullName) {
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

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", fullName=" + fullName + "]";
	}
	
	

}
