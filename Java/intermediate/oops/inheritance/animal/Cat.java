package oops.inheritance.animal;

public class Cat extends Animal {
	String sound;
	
	public void sound(String sound) {
		System.out.println("The cat sounds " + sound);
	}
}
