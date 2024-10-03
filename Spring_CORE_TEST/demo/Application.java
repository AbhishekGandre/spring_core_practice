package com.example.demo;

  


//import com.spring.Student;s

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		
//	    Resource resource=new ClassPathResource("NewFile.xml");  
//	    BeanFactory factory=new XmlBeanFactory(resource);  
//	      
//	    Student student=(Student)factory.getBean("studentbean");  
//	    student.displayInfo();  
	    
	    
	    
	    @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
	    Student obj = (Student)(context.getBean("studentbean"));
	    obj.displayInfo(); 
	}

}
