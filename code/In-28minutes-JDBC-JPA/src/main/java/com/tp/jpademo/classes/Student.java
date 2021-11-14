package com.tp.jpademo.classes;

import java.util.Date;

public class Student {
	int stud_id;
	String full_name;
	String location;
	Date birth_date;
	
	public Student() {
		super();
	}
	
	public Student(int stud_id, String full_name, String location, Date birth_date) {
		super();
		this.stud_id = stud_id;
		this.full_name = full_name;
		this.location = location;
		this.birth_date = birth_date;
	}
	
	public Student(String full_name, String location, Date birth_date) {
		super();
		this.full_name = full_name;
		this.location = location;
		this.birth_date = birth_date;
	}

	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	@Override
	public String toString() {
		return "\n Student [stud_id=" + stud_id + ", full_name=" + full_name + ", location=" + location + ", birth_date="
				+ birth_date + "]";
	}
	
	
}
