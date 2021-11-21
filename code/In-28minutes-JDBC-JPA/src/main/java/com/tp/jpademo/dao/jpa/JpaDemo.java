package com.tp.jpademo.dao.jpa;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JpaDemo {

	@Autowired
	StudentJpaRepository jpaRepository;
	
	private static Logger logger = LoggerFactory.getLogger(JpaDemo.class);
	
	public void test() {
		logger.info("105 users -> {}", jpaRepository.findById(105));
	}
}
