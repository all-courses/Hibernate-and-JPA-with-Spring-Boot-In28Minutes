package com.tp.jpademo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentPassport")
public class Passport {
	@Id
	@GeneratedValue
	@Column(name = "passport_id")
	long id;
	
	@Column(name = "passport_number",length = 8,nullable = false)
	String srNumber;

	public Passport() {
		super();
	}

	public Passport(long id, String srNumber) {
		super();
		this.id = id;
		this.srNumber = srNumber;
	}

	public Passport(String srNumber) {
		super();
		this.srNumber = srNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSrNumber() {
		return srNumber;
	}

	public void setSrNumber(String srNumber) {
		this.srNumber = srNumber;
	}

	@Override
	public String toString() {
		return "\n Passport [id=" + id + ", srNumber=" + srNumber + "]";
	}
	
	
}
