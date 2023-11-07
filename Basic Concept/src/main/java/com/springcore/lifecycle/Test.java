package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/lifecycle/Configuration.xml");
		
//		XmlUse objSamosa=(XmlUse)applicationContext.getBean("s1");
//		  System.out.println(objSamosa);
//		  applicationContext.registerShutdownHook(); // destory called 
//		  
//		  System.out.println("**********************************************************");
//		  
//		  InterfaceUse objInterfaceUse=(InterfaceUse)applicationContext.getBean("s2");
//		  System.out.println(objInterfaceUse);
//		  
//		  System.out.println("**********************************************************");
//		  
		  AnnotationUse annotationUse=(AnnotationUse)applicationContext.getBean("s3");
		  System.out.println(annotationUse);
		  
		  
	}
	

}
