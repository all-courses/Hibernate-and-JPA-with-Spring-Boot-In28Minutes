package com.tp.jpademo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.tp.jpademo.model.Course;
import com.tp.jpademo.model.Passport;
import com.tp.jpademo.model.Review;
import com.tp.jpademo.model.Student;

@Repository
@Transactional
public class StudentRepo {
	@PersistenceContext
	EntityManager em;
	
	private static Logger logger =LoggerFactory.getLogger(StudentRepo.class);
	
	public void startTesting() {
		//insertPassportStudent();
		
		courseReviewTesting();
	}
	
	private void courseReviewTesting() {
		Course course=em.find(Course.class, 101L);
		logger.info("Course ="+course);
		logger.info("Course Reviews= "+course.getCourseReviews());
		
		Review r1 = new Review("4", "Okay");
		Review r2 = new Review("2.5", "only for beginners");
		
		/*
		 * For updating course reviews in this method used Block 1 or Block 2
		 */
		/// Block 1
		course.addReview(r1);
		course.addReview(r2);
		
		r1.setCourse(course);
		r2.setCourse(course);
		
		em.persist(r1);
		em.persist(r2);
		
		/// Block 2
//		em.flush();
//		em.refresh(course);
		
		logger.info("Course Reviews= "+course.getCourseReviews());
	}

	private void insertPassportStudent() {
		Passport passport=new Passport("W5675624");
		em.persist(passport);
		
		Student student=new Student("Kiran Patel");
		student.setPassport(passport);
		em.persist(student);
	}
}
