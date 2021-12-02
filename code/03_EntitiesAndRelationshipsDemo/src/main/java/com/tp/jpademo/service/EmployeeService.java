package com.tp.jpademo.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.jpademo.model.FullTimeEmployee;
import com.tp.jpademo.model.PartTimeEmployee;
import com.tp.jpademo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	private static Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	public void testAll() {
		logger.info("All Employees -> {}", employeeRepo.getAllEmployees());
		
		PartTimeEmployee employeePT1= new PartTimeEmployee("Raj Mane", new BigDecimal(50));
		PartTimeEmployee employeePT2= new PartTimeEmployee("Rajesh Tope", new BigDecimal(20));
		employeeRepo.insertEmployee(employeePT1);
		employeeRepo.insertEmployee(employeePT2);
		logger.info("All Employees after inserted PT Emp only-> {}", employeeRepo.getAllEmployees());
		
		FullTimeEmployee employeeFT1 = new FullTimeEmployee("Avdhut Lokhande", new BigDecimal(1000));
		FullTimeEmployee employeeFT2 = new FullTimeEmployee("vittal Pure", new BigDecimal(1499));
		employeeRepo.insertEmployee(employeeFT1);
		employeeRepo.insertEmployee(employeeFT2);
		logger.info("All Employees  after inserted FT Emp only-> {}", employeeRepo.getAllEmployees());
	}

}
