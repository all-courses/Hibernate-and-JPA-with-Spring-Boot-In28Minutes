package com.tp.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tp.jpademo.repository.StudentRepo;
import com.tp.jpademo.service.EmployeeService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	StudentRepo studentRepo;
	@Autowired
	EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//studentRepo.startTesting();
		employeeService.testAll();
	}

}
