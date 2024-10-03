package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("constructor/constructor.xml");
		
		Employee employee = (Employee) ctx.getBean("empp","empp2");
		System.out.println(employee);
		
		
		
	}

}
