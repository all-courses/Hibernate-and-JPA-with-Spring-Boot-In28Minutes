package com.tp.jpademo.classes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentJava {
	@Id
	@GeneratedValue
	@Column(name = "stud_id")
	int id;
	
	@Column(name= "full_name")
	String fullName;	
	
	String location;
	
	@Column(name =  "birth_date")
	Date dob;
	
	public StudentJava() {
		super();
	}
	
	public StudentJava(int id, String fullName, String location, Date dob) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.location = location;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "\n StudentJava [id=" + id + ", fullName=" + fullName + ", location=" + location + "]";
	}
	
	
}
