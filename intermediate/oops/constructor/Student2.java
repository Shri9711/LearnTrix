package oops.constructor;

public class Student2 {
	int roll;
	String name;
	public static int count = 0;
	
	Student2(int rn, String nm) {
		roll = rn;
		name = nm;
		//System.out.println(rn + ". " + nm);
		count++;
	}
}
