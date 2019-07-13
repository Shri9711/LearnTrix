package class_;

public class Human {
	boolean isMan = true;
	String color = "white";
	int eyes = 2;
	int ears = 2;
	int legs;
	boolean isTeeth;
	
	
	public void appearance() {
		System.out.println("This is the Man");
		System.out.println("The color of the man is " + color);
		System.out.println("He have " + eyes + " eyes");
		System.out.println("He have " + ears + " ears");
	}
	
	public void eat(boolean isTeeth) {
		if(isTeeth) {
			System.out.println("He can eat!");
		} else {
			System.out.println("He does not able to eat");
		}
	}
	
	public void walk(int legs) {
		if(legs == 2) {
			System.out.println("He can walk");
		} else {
			System.out.println("He is not able to walk");
		}
	}
}
