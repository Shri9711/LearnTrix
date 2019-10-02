package collection.sort.Student;

public class Student {
	String name;
	int rollNo;
	int marks;
		
	Student(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo =" + rollNo + ", name = " + name + ", marks = " + marks + "]\n";
	}
}
