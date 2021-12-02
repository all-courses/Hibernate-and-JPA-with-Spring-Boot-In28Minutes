package com.tp.jpademo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Employee {
	@Id
	@GeneratedValue
	protected Long id;
	
	@Column
	protected String fullName;

	protected Employee() {
		super();
	}

	protected Employee(String fullName) {
		super();
		this.fullName = fullName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "\n Employee [id=" + id + ", fullName=" + fullName + "]";
	}
	
	
}
