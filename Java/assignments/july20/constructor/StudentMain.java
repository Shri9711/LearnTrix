package assignments.constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Ankush", "Kudal");
		System.out.println(student1.rollNo);
		
		Student student2 = new Student(1, "Ankush", "8785779367", "cankush625@gmail.com");
		System.out.println(student2.name);
		
		Student student3 = new Student("Roshan", "Kudal");
		System.out.println(student3.rollNo);
		System.out.println(student3.name);
	}

}
