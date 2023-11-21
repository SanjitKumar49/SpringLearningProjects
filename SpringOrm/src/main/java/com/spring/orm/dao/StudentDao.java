package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	// Save Student
	public int insert(Student student) {
		Integer integer=(Integer) this.hibernateTemplate.save(student);
		return integer;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
