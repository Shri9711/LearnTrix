package hashmap.employee_using_hashtable;

import java.util.Hashtable;

public class EmpDetails {
	@SuppressWarnings("rawtypes")
	private Hashtable<Integer, Employee> employee = new Hashtable<Integer, Employee>();
	
	public void addEntry(int id, Employee emp) {
		employee.put(id, emp);
	}
	
	public void printEmpDetails(Integer ID) {
			Employee emp = employee.get(ID);
			System.out.println("Id : " + ID + " | " + "Employee Name : " + emp.name + " | " + " Salary : " + emp.salary);
	}
	
	public void getEmpSalary(Integer ID) {
		
		Employee emp = employee.get(ID);
		
		if(emp == null) {
			System.out.println("Employee is not found!");
		} else {
			System.out.println("Employee ID : " + emp.empId + " | " + " Salary : " + emp.salary);
		}
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Ankush", 2000000);
		Employee emp2 = new Employee(2, "Rutuj", 2100000);
		Employee emp3 = new Employee(3, "Shreyas", 2200000);
		Employee emp4 = new Employee(4, "Kuldeep", 2300000);
		
		EmpDetails empDetails = new EmpDetails();
				
		empDetails.addEntry(1, emp1);
		empDetails.addEntry(2, emp2);
		empDetails.addEntry(3, emp3);
		empDetails.addEntry(4, emp4);
		
		empDetails.printEmpDetails(1);
		
		System.out.println("***********************************************");
		
		empDetails.getEmpSalary(4);
		empDetails.getEmpSalary(8);
		
	}
}
