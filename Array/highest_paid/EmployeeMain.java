package Array.highest_paid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int empNo;
//		String name;
//		String designation;
//		Double salary;
		Employee obEmp = new Employee();
		Employee emp1 = new Employee(123, "K1", "Engineer", 2000000);
		Employee emp2 = new Employee(124, "K2", "Engineer", 3000000);
		Employee emp3 = new Employee(125, "K3", "Engineer", 1500000);
		Employee emp4 = new Employee(126, "K4", "lead", 4000000);
		Employee emp5 = new Employee(127, "K5", "lead", 4500000);
		Employee emp6 = new Employee(128, "K6", "lead", 6200000);
		Employee emp7 = new Employee(129, "K7", "lead", 3500000);
		
		Employee empDetails[] = {emp1, emp2, emp3, emp4, emp5, emp6, emp7};
		ArrayList<Employee> emplDet = new ArrayList<>(Arrays.asList(empDetails));
		Employee engineers[] = new Employee[7];
				
		/*User input*/
//		for(int i = 0; i < empDetails.length; i++) {
//			System.out.println("Enter the Employee Number");
//			empNo = scanner.nextInt();
//			System.out.println("Enter the Employee Name");
//			name = scanner.next();
//			System.out.println("Enter the Employee Designation");
//			designation = scanner.next();
//			System.out.println("Enter the Employee Salary");
//			salary = scanner.nextDouble();
//			empDetails[i] = new Employee(empNo, name, designation, salary);
//		}
//		
//		System.out.println(empDetails[3].salary);
		
		obEmp.sortEmployeeBySalary(empDetails);
		obEmp.findHighestPaid(empDetails);
		
	}
}
