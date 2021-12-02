package com.tp.jpademo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee{
	private BigDecimal salary;

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(String fullName, BigDecimal salary) {
		super(fullName);
		this.salary = salary;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n FullTimeEmployee [salary=" + salary + ", id=" + id + ", fullName=" + fullName + "]";
	}

}
