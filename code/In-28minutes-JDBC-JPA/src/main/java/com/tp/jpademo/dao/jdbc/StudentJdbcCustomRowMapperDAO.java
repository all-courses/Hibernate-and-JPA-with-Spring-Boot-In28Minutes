package com.tp.jpademo.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tp.jpademo.classes.StudentJava;

@Repository
public class StudentJdbcCustomRowMapperDAO {
	@Autowired
	JdbcTemplate template;
	
	class StudentRowMapper implements RowMapper<StudentJava>{

		@Override
		public StudentJava mapRow(ResultSet rs, int rowNum) throws SQLException {
			StudentJava stud = new StudentJava();
			stud.setId(rs.getInt("stud_id"));
			stud.setFullName(rs.getString("full_name"));
			stud.setLocation(rs.getString("location"));
			stud.setDob(rs.getTimestamp("birth_date"));
			return stud;
		}
		
	}
	public List<StudentJava> findAll(){
		return template.query("select * from student", new StudentRowMapper());
	}
	
	public StudentJava findById(int id) {
		return template.queryForObject("select * from student where stud_id=?", new Object[] {id}, 
				new StudentRowMapper());
	}
		
}
