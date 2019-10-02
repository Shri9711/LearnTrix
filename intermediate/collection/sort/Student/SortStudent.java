package collection.sort.Student;
import java.util.Comparator;

public class SortStudent implements Comparator<Student> {

	@Override
	public int compare(Student first, Student second) {
		return first.marks >= second.marks ? 1 : -1;
	}
	
}
