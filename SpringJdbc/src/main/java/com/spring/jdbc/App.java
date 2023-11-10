package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Programm started...." );
        
//         for Without Xml-- jdbcConfig
//        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
//        StudentDao studentDao=context.getBean(StudentDao.class);
        
        
      ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       StudentDao studentDao=context.getBean("StudentDaoImpl",StudentDao.class);
       
       
           // update Op
       
//       Student student=new Student();
//       student.setId(506);
//       student.setName("Amajd Ali");
//       student.setCity("Sasaram");
//       int result = studentDao.insert(student);
//         System.out.println("student add.." +result);

       
           // Update Op
//       Student student=new Student();
//       student.setId(505);
//       student.setName("Amjad Ali");
//       student.setCity("Bihar");
//       int result = studentDao.update(student);  
//       System.out.println("data will changed.."+result);
       
       
            // delete Op
//       Student student=new Student();
//       student.setId(506);
//       int result=studentDao.delete(student);
//       System.out.println("student data is deleted.."+result);

       
         //getOne data
       
//      Student student= studentDao.getStudent(501);
//      System.out.println(student);
       
       List<Student> students=studentDao.getAllStudents();
       for (Student student : students) {
    	   System.out.println(student);
		
	}
    }
}
