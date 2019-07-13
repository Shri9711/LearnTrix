package class_;

public class Employee {
	int id;
	String name;
	boolean isMale;
	String position;
	boolean isPresent;
	
	public void employeeDetails(int id, String name,boolean isMale, String position) {
		System.out.println("The employee id is " + id);
		System.out.println("The employee name is " + name);
		if(isMale) {
			System.out.println("The employee gender is Male");
		} else {
			System.out.println("The employee gender is Female");
		}
		System.out.println("The employee position is " + position);
	}
	
	public void isPresent(boolean isPresent) {
		if(isPresent) {
			System.out.println("The employee is present today");
		} else {
			System.out.println("The employee is absent today");
		}
	}
}
