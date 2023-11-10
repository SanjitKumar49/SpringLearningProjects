package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentdaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	// insert query
	@Override
	public int insert(Student student) {
		
		String query = "insert into student(id,name,city)value(?,?,?)";
		int Result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return Result;
	}
	
	// update Query
	@Override
	public int update(Student student) {
		String query = "UPDATE student SET name=?, city=? WHERE id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}
	
	@Override
	//Delete Query
	public int delete(Student student) {
		String query = "DELETE FROM student WHERE id=?";
		int result = this.jdbcTemplate.update(query,student.getId());
		return result;
	}
	
	@Override
	//Select single STudent data
	public Student getStudent(int studentId) {
   String query="select * from student where id=?";
   RowMapper<Student> rowMapper=new RowMapperImpl();
   Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	@Override
	//selecting multiple all student
	public List<Student> getAllStudents() {
		String query="select * from student";
		List<Student> student=this.jdbcTemplate.query(query,new RowMapperImpl());
		return student;
	}

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	

}
