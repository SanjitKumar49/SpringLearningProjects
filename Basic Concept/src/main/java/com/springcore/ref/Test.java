package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconf.xml");
	       A tempA=(A)context.getBean("aref");
	       System.out.println(tempA.getX());
	       System.out.println(tempA);
	       //System.out.println(tempA.getOb().getY());
	}

}
