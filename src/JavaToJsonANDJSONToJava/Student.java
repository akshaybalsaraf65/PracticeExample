package JavaToJsonANDJSONToJava;

public class Student {

	private int sid;
	private String name;
	private int marks;
	private Address address;
	
	public int getSid() {
		
		return sid;
	}
	
	public void SetSid(int sid) {
		
		this.sid = sid;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void SetName(String name) {
		
		this.name = name;
	}
	
	public int getMarks() {
		
		return marks;
	}
	
	public void SetMarks(int marks) {
		
		this.marks = marks;
	}
	
	public Address getAddress() {
		
		return address;
	}
	
	public void SetAddress(Address a) {
		
		this.address = a;
	}
}
