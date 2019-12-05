package oops.constructor;

public class Student2Main {

	public static void main(String[] args) {
		Student2 s1 = new Student2(9, "Ankush");
		
		Student2 s2 = new Student2(1, "abc");
		
		System.out.println(s1.roll);
		System.out.println(s2.roll);
		System.out.println("The " + s1.count + " records are created!");
		System.out.println("The " + s2.count + " records are created!");
		
//		Student2.count;
		/*count is shared because it is defined as a static and shared between all the objects.
		 * if we call that count by any object name the it will give total counts for the class*/
	}

}
