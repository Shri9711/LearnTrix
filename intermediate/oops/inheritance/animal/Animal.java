package oops.inheritance.animal;

public class Animal {
	int eyes;
	int legs;
	String Sound;
	
	public void appearance(int eyes, int legs) {
		System.out.println(eyes);
		System.out.println(legs);
	}
	
	public void sound(String sound) {
		System.out.println("The animal sounds " + sound);
	}
	
	public static void eat() {
		System.out.println("Eat method for animal is called");
	}
}
