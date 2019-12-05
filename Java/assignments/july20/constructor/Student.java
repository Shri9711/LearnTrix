package assignments.constructor;

public class Student {
	int rollNo;
	String name;
	String address;
	String mobNo;
	String email;
	static int counter = 0;
	
	Student(int rollNo, String name, String address){
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		counter++;
	}
	
	Student(int rollNo, String name, String mobNo, String email) {
		this.rollNo = rollNo;
		this.name = name;
		this.mobNo = mobNo;
		this.email = email;
		counter++;
	}
	
	Student(String name, String address) {
		counter++;
		this.rollNo = counter;
		this.name = name;
		this.address = address;
	}
}
