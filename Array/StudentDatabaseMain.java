package Array;

public class StudentDatabaseMain {
	public static void main(String[] args) {
		
		StudentDatabase newStud1 = new StudentDatabase(11, "KD", 69.99);
		StudentDatabase newStud2 = new StudentDatabase(12, "PK", 86.66);
		StudentDatabase newStud3 = new StudentDatabase(13, "RM", 88.77);
		StudentDatabase newStud4 = new StudentDatabase(14, "KSD", 99.89);
		StudentDatabase newStud5 = new StudentDatabase(15, "PM", 99.99);
		StudentDatabase newStud6 = new StudentDatabase(16, "MN", 96.67);
		
		StudentDatabase stud[] = new StudentDatabase[7];
		
		stud[0] = newStud1;
		stud[1] = newStud2;
		stud[2] = newStud3;
		stud[3] = newStud4;
		stud[4] = newStud5;
		stud[5] = newStud6;
		
		for(int i = 0; i < stud.length; i++) {
			for(int j = i + 1; j < stud.length; j++) {
				if(stud[i].marks < stud[j].marks) {
					stud[6] = stud[i];
					stud[i] = stud[j];
					stud[j] = stud[6];
				}
			}
		}
		System.out.println("The topper scored " + stud[0].marks);
		System.out.println("The second topper scored " + stud[1].marks);
		
		System.out.println("The difference between scores of first topper and second topper is : " + (stud[0].marks - stud[1].marks));
	}
}
