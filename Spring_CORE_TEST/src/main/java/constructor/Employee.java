package constructor;

public class Employee {
	
	
	String name	;
	int salary;
	int id;
	Address address	;
	
	public Employee(String name, int salary, int id, Address address) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", address=" + address + "]";
	}


}
