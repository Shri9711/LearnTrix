package oops.inheritance.animal;

public class Dog extends Animal {
	String type;
	
	@Override
	public void appearance(int eyes, int legs) {
		System.out.println("This dog has " + eyes + " eyes");
		System.out.println("This dog has " + legs + " legs");
	}
	
	@Override
	public void sound(String sound) {
		System.out.println("The dog sounds " + sound);
	}
}
