package Array.DivisionToppers;

import java.util.Scanner;
import java.util.Scanner;

public class DivisionStudentDataMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DivisionStudentData newStud1 = new DivisionStudentData(11, "KD", 69.99);
		DivisionStudentData newStud2 = new DivisionStudentData(12, "PK", 86.66);
		DivisionStudentData newStud3 = new DivisionStudentData(13, "RM", 88.77);
		DivisionStudentData newStud4 = new DivisionStudentData(14, "KSD", 99.89);
		DivisionStudentData newStud5 = new DivisionStudentData(15, "PM", 99.99);
		DivisionStudentData newStud6 = new DivisionStudentData(16, "MN", 96.67);
		DivisionStudentData newStud7 = new DivisionStudentData(17, "AC", 98.89);
		DivisionStudentData newStud8 = new DivisionStudentData(18, "AD", 98.34);
		DivisionStudentData newStud9 = new DivisionStudentData(19, "AS", 89.78);
			
		DivisionStudentData divA[] = new DivisionStudentData[6];
		DivisionStudentData divB[] = new DivisionStudentData[5];
			
			divA[0] = newStud1;
			divA[1] = newStud2;
			divA[2] = newStud3;
			divA[3] = newStud4;
			divA[4] = newStud5;
			
			divB[0] = newStud6;
			divB[1] = newStud7;
			divB[2] = newStud8;
			divB[3] = newStud9;
			
			//For division A
	//		for(int i = 0; i < divA.length; i++) {
	//			for(int j = i + 1; j < divA.length; j++) {
	//				if(divA[i].marks < divA[j].marks) {
	//					divA[5] = divA[i];
	//					divA[i] = divA[j];
	//					divA[j] = divA[5];
	//				}
	//			}
	//		}
			
			System.out.println("Enter number of records for division");
			int n = scanner.nextInt() + 1;
			
			DivisionStudentData.arrangeScores(divA, n);
			
			System.out.println("The topper scored " + divA[0].marks);
			System.out.println("The second topper scored " + divA[1].marks);
			
			System.out.println("The difference between scores of first topper and second topper is : " + (divA[0].marks - divA[1].marks));
			
			//For division B
			for(int i = 0; i < divB.length; i++) {
				for(int j = i + 1; j < divB.length; j++) {
					if(divB[i].marks < divB[j].marks) {
						divB[4] = divB[i];
						divB[i] = divB[j];
						divB[j] = divB[4];
					}
				}
			}
			System.out.println("The topper scored " + divB[0].marks);
			System.out.println("The second topper scored " + divB[1].marks);
			
			System.out.println("The difference between scores of first topper and second topper is : " + (divB[0].marks - divB[1].marks));
	}
}
