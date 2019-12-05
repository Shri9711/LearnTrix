package Array.highest_paid;

public class Employee {
	int empNo;
	String name;
	String designation;
	double salary;
	
	Employee(int empNo, String name, String designation, double salary) {
		this.empNo = empNo;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
		
	public void sortEmployeeBySalary(Employee[] engg) {
		Employee temp;
		for(int i = 0; i < engg.length; i++) {
			for(int k = i + 1; k < engg.length; k++) {
					if(engg[i].salary < engg[k].salary) {
					temp = engg[i];
					engg[i] = engg[k];
					engg[k] = temp;
				}
			}
		}
	}
	
	public void findHighestPaid(Employee[] emp) {
		int count = 0;
		while(count != 2) {
		System.out.println("Highest paid employee is " + emp[0].name + " with salary " + emp[0].salary);
		
		for(int i = 0; i < emp.length; i++) {
			for(int j = 1; j < emp.length; ++j) {
				if(emp[i].designation.equals(emp[0].designation)) {
					emp[i] = emp[j];
				}
			}
		}
		count++;
		}
	}
	
	public void topPaidEngineer(Employee[] emp) {
		Employee top[] = new Employee[1];
		for(int i = 0; i < emp.length; i++) {
			for(int j = i + 1; j < emp.length; j++) {
				if(emp[i].salary > emp[j].salary && emp[i].designation.equals("Engineer")) {
					top[0] = emp[i];
				}
			}
		}
		System.out.println("Highest paid salary is : " + top[0].salary);
	}
}
