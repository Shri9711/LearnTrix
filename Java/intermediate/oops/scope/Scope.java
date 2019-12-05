package oops.scope;

public class Scope {
	int x;
	
	public static void main(String[] args) {
		Scope sc = new Scope();
		
		sc.x = 5;
		int x = 9;
		sc.hide(10);
	}
	
	public void show(int z) {
		x = 10;
		z = 5;
	}
	
	public void hide(int a) {
		int result = a;
		System.out.println(x);
	}
}
