package basic;

public class Student1 {
	String name;
	double age;
	
	public static void main(String[] args) {
		Student1 student = new Student1();
		student.name = "Ankush";
		student.age = 20.5; //the precision of the double is greater than float. Hence when we define variable as float give decimal value
		//java considers it as an double and throws an error
		
		//System.out.println("Name is " + student.name  + " age is " + student.age);
		System.out.println("Name is " + student.name);
		System.out.println("Age is " + student.age);
		
		System.out.print(student.name);
		System.out.print(student.name);
	}
}
