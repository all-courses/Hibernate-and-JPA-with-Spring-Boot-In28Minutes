package com.tp.jpademo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tp.jpademo.model.Employee;

@Repository
@Transactional
public class EmployeeRepo {
	@PersistenceContext
	EntityManager entityManager;
			
	public void insertEmployee(Employee employee) {
		entityManager.persist(employee);	
	}
	
	public List<Employee> getAllEmployees(){
		return entityManager.createQuery("select e from Employee e", Employee.class).getResultList();
	}
}
