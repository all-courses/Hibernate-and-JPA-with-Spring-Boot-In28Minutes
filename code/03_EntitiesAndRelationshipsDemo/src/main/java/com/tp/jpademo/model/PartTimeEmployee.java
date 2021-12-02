package com.tp.jpademo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee {
	private BigDecimal hourlyWage;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String fullName, BigDecimal hourlyWage) {
		super(fullName);
		this.hourlyWage = hourlyWage;
	}

	public BigDecimal getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(BigDecimal hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public String toString() {
		return "\n PartTimeEmployee [hourlyWage=" + hourlyWage + ", id=" + id + ", fullName=" + fullName + "]";
	}
	
}
