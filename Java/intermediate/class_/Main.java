package class_;

public class Main {
	public static void main(String[] args) {
		Human ankush = new Human();
		
		ankush.appearance();
		ankush.eat(true);
		ankush.walk(2);
		
		Song song = new Song();
		song.songDetails("abc", "05:24", "dfg", "asc");
		
		Chair chair = new Chair();
		chair.typeOfChair(4, true, false);
		chair.typeOfChair(4, false, true);
		chair.typeOfChair(3, true, false);
		chair.typeOfChair(4, true, true);
		
		Employee employee = new Employee();
		employee.employeeDetails(2, "Ankush", true, "Manager");
		employee.isPresent(true);
	}
}
