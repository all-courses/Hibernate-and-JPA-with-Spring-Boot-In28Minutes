package com.tp.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tp.jpademo.dao.jdbc.JdbcDemo;
import com.tp.jpademo.dao.jpa.JpaDemo;

@SpringBootApplication
public class In28minutesJdbcJpaApplication implements CommandLineRunner{

	@Autowired
	private JdbcDemo m_jdbcDemo;
	
	@Autowired
	private JpaDemo m_JpaDemo;
	
	public static void main(String[] args) {
		SpringApplication.run(In28minutesJdbcJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		m_jdbcDemo.demo();
		m_JpaDemo.test();		
	}

}
