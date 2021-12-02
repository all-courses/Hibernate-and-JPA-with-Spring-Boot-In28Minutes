package com.tp.jpademo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {
	@Id
	@GeneratedValue
	@Column(name = "course_id")
	long id;
	
	@Column(name = "course_name",length = 50,nullable = false)
	String fullName;

	@OneToMany(mappedBy = "course")
	private List<Review> courseReviews = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "Enrollment",
	joinColumns = @JoinColumn(name="Course_Id"),
	inverseJoinColumns = @JoinColumn(name="Student_Id"))
	private List<Student> students= new ArrayList<>();
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Course() {
		super();
	}

	public Course(long id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public Course(String fullName) {
		super();
		this.fullName = fullName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Review> getCourseReviews() {
		return courseReviews;
	}

	public void addReview(Review review) {
		courseReviews.add(review);
	}
	
	public void removeReview(Review review) {
		courseReviews.remove(review);
	}
	public void setCourseReviews(List<Review> courseReviews) {
		this.courseReviews = courseReviews;
	}

	@Override
	public String toString() {
		return "\n Course [id=" + id + ", fullName=" + fullName + "]";
	}
	
	

}
