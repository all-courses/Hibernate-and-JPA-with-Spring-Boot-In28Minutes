package com.tp.jpademo.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tp.jpademo.classes.StudentJava;

@Repository
@Transactional
public class StudentJpaRepository {

	@PersistenceContext
	EntityManager entityMngr;
	
	public List<StudentJava> findAll(){
		return null;
		
	}
	
	public StudentJava findById(int id) {
		return entityMngr.find(StudentJava.class, id);
	}
}
