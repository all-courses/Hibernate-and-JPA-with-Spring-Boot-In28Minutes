package com.tp.jpademo.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tp.jpademo.model.Employee;
import com.tp.jpademo.model.FullTimeEmployee;
import com.tp.jpademo.model.PartTimeEmployee;

@Repository
@Transactional
public class EmployeeRepo {
	@PersistenceContext
	EntityManager entityManager;
			
	public void insertEmployee(Employee employee) {
		entityManager.persist(employee);	
	}
	
	public List<Employee> getAllEmployees(){
		List<PartTimeEmployee> employeesPT = entityManager.createQuery("select e from PartTimeEmployee e", PartTimeEmployee.class).getResultList();
		List<FullTimeEmployee> employeesFT = entityManager.createQuery("select e from FullTimeEmployee e", FullTimeEmployee.class).getResultList();
		
		Iterator<PartTimeEmployee> itr1 = employeesPT.iterator();
		Iterator<FullTimeEmployee> itr2 = employeesFT.iterator();
		
		List<Employee> allEmployees = new ArrayList<>();
		while(itr1.hasNext()) {
			allEmployees.add(itr1.next());
		}
		while(itr2.hasNext()) {
			allEmployees.add(itr2.next());
		}
		
		return allEmployees;
	}
}
