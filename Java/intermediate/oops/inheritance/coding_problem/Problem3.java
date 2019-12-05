package inheritance.coding_problem;

public class Problem3 {
	String s = "Class A";
}

class Proble3 extends Problem3{
	String s = "Class B";
	{
		System.out.println(super.s);
	}
}

class Probl3 extends Proble3 {
	String s = "Class C";
	{
		System.out.println(super.s);
	}
}
