package basic;

public class Student {
	String name;

	public static void main(String[] args) {
		Student firstStudent = new Student();
		firstStudent.name = "Ankush";
		
		System.out.println("Hello " + firstStudent.name + "! Welcome to Java programming.");
	}
}
