package com.sanjit49.SecondProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /*Action obj=new Ram();   // here i store ram object in action
        obj.eat();
        obj.sleep();*/
        
        ApplicationContext obj=new ClassPathXmlApplicationContext("com/sanjit49/SecondProject/config.xml");
         Ram ramobj=obj.getBean("ram",Ram.class);
         ramobj.eat();
         ramobj.sleep();
         
         
         Shyam shayamobj=obj.getBean("shayam",Shyam.class);
         shayamobj.eat();
         shayamobj.sleep();

    }
}
