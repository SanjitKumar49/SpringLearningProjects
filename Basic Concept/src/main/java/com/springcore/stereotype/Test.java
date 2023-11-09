package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
   ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
	Student student=context.getBean("ob",Student.class);
//	System.out.println(student);
//	Student student2=context.getBean("ob",Student.class);
	
	
//	System.out.println(student.hashCode());
//	System.out.println(student2.hashCode());
	
    System.out.println("--------------------");
    Teacher teacher=context.getBean("teacher",Teacher.class);
    Teacher teacher2=context.getBean("teacher",Teacher.class);

    System.out.println(teacher.hashCode());
    System.out.println(teacher2.hashCode());

    
    

	}

}
