package com.tp.jpademo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tp.jpademo.model.Passport;
import com.tp.jpademo.model.Student;

@Repository
@Transactional
public class StudentRepo {
	@PersistenceContext
	EntityManager em;
	
	public void startTesting() {
		insertPassportStudent();
	}
	
	private void insertPassportStudent() {
		Passport passport=new Passport("W5675624");
		em.persist(passport);
		
		Student student=new Student("Kiran Patel");
		student.setPassport(passport);
		em.persist(student);
	}
}
