package Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
  	
  	String name;
  	int	age;
  	
  														
  	Address address;
  	
  	
  	
  	
  										
  	
	public Address getAddress() {
		return address;
	}
	@Autowired
  	@Qualifier("address2")	
	public void setAddress(Address address) {
		System.out.println("Setter called");
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}



	
	
	



  	
  

}
