package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC_CONTAINER {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("ioc/Newfile.xml");
		MyDetails md= (MyDetails) ctx.getBean("Std");
		System.out.println(md);
		CollectionInjection Ci=(CollectionInjection) ctx.getBean("collection");
		System.out.println(Ci);

	}

}

