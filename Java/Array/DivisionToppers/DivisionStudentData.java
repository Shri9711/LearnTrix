package Array.DivisionToppers;

public class DivisionStudentData {
	int rollNo;
	String Name;
	double marks;
	
	DivisionStudentData(int rollNo, String Name, double marks) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.marks = marks;
	}
	
	public static void arrangeScores(DivisionStudentData div[], int n) {
		for(int i = 0; i < div.length; i++) {
			for(int j = i + 1; j < div.length; j++) {
				if(div[i].marks < div[j].marks) {
					div[n] = div[i];
					div[i] = div[j];
					div[j] = div[n];
				}
			}
		}
		
	}
}
