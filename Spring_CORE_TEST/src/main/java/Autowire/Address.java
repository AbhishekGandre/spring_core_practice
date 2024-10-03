package Autowire;

public class Address {
	
	
	String City	;
	String State;
	int Zipcode;
	
	public Address(String city, String state, int zipcode) {
		super();
		City = city;
		State = state;
		Zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Zipcode=" + Zipcode + "]";
	}

}
