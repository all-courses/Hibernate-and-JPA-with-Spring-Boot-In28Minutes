package com.tp.jpademo.dao.jdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tp.jpademo.classes.Student;

@Component
public class JdbcDemo {
	@Autowired
	StudentJdbcDAO studentJdbcDAO;
	
	@Autowired
	StudentJdbcCustomRowMapperDAO customRowMapperDAO;
	
	private static Logger logger =LoggerFactory.getLogger(StudentJdbcDAO.class);
	
	public void demo() {
		logger.info("All users -> {}", studentJdbcDAO.findAll());
		logger.info("105 users -> {}", studentJdbcDAO.findById(105));
		
		logger.info("Inserting -> {}", 
				studentJdbcDAO.insert(new Student("Tara", "Berlin", new Date())));
		
		logger.info("Update 0 -> {}", 
				studentJdbcDAO.update(new Student(0, "Pieter", "Utrecht", new Date())));
		
		
		logger.info("All users -> {}", customRowMapperDAO.findAll());
		logger.info("110 users -> {}", customRowMapperDAO.findById(110));
	}
}
