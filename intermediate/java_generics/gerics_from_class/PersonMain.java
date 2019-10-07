package java_generics.gerics_from_class;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person<String, Integer> person = new Person<String, Integer>();
				
		System.out.println("Enter the name of the person");
		String name = scanner.nextLine();
		
		System.out.println("Enter the age of the person");
		int age = scanner.nextInt();
		
		person.setPerson(name, age);
		
		scanner.close();
		
		System.out.println(person.getPersonName());
		System.out.println(person.getPersonAge());
		
		
	}
}