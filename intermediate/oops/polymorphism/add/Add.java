package oops.polymorphism.add;

public class Add {
	int a;
	int b;
	
	//by method overloading
	
	public void add(int a, int b) {
		int d = a + b;
		System.out.println("The addition of " + a + " and " + b + " is " + d);
	}
	
	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("The addition of " + a + " and " + b + " and " + c + " is " + d);
	}
}
