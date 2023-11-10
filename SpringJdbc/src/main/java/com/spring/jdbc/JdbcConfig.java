package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentdaoImpl;

@Configuration
public class JdbcConfig {
	
	@Bean(name= {"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://Localhost:3306/springdb");
		ds.setUsername("root");
		ds.setPassword("Siv@2002");
		return ds;
	}
	
	
	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate geTemplate() {
	 JdbcTemplate jdbcTemplate=new JdbcTemplate();
	 jdbcTemplate.setDataSource(getDataSource());
	 return jdbcTemplate;
	}
	
	
	@Bean(name= {"studentDao"})
	public StudentDao getStudentDao() {
		 StudentdaoImpl studentDao=new StudentdaoImpl();
		 studentDao.setJdbcTemplate(geTemplate());
		return studentDao;
		 
	}

}
