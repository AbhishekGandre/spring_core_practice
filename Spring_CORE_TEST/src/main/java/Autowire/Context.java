package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Context {
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Autowire/autowire.xml");
		Student student=(Student) ctx.getBean("std");
		System.out.println(student);
		
	}

}
