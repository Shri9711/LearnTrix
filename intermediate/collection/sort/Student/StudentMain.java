package collection.sort.Student;
import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		Student stud = new Student("Ankush", 2, 97);
		Student stud1 = new Student("Abc", 7, 93);
		Student stud2= new Student("Bcd", 6, 94);
		Student stud3 = new Student("Dcf", 9, 91);
		
		student.add(stud);
		student.add(stud1);
		student.add(stud2);
		student.add(stud3);
		
		
		Collections.sort(student, new SortStudent());
				
		System.out.println(student.toString());
	}
}
