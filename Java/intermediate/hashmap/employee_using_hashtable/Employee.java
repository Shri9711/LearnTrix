package hashmap.employee_using_hashtable;

public class Employee {
	int empId;
	String name;
	int salary;
	
	Employee(int empId, String name, int salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getempId() {
		return empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
}
