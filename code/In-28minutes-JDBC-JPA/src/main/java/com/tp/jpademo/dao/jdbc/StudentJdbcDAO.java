package com.tp.jpademo.dao.jdbc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tp.jpademo.classes.Student;

@Repository
public class StudentJdbcDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Student> findAll(){
		return jdbcTemplate.query("select * from Student", 
				new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public Student findById(int id){
		return jdbcTemplate.queryForObject("select * from Student where stud_id=?",new Object[] {id}, 
				new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public int deleteById(int id) {
		return jdbcTemplate.update("delete studuent where id=?",new Object[] {id});
	}
	
	public int insert(Student student) {
		return jdbcTemplate.update("insert into student values(?,?,?,?)",
				new Object[] {student.getStud_id(), student.getFull_name(), student.getLocation(), new Timestamp(student.getBirth_date().getTime())});
	}
	
	public int update(Student student) {
		return jdbcTemplate.update("update student set full_name = ?, location = ?, birth_date = ? where stud_id = ?",
				new Object[] {student.getFull_name(), student.getLocation(), new Timestamp(student.getBirth_date().getTime()), student.getStud_id()});
	}
}
