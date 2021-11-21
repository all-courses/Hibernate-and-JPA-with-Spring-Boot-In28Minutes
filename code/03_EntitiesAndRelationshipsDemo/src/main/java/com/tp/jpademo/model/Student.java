package com.tp.jpademo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	private Passport passport;
	
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
