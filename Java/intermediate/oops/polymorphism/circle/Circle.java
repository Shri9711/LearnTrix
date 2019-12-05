package oops.polymorphism.circle;

public class Circle {
	public void draw(String color) {
		System.out.println("Drawing in the " + color + " color");
	}
	
	public void draw() {
		System.out.println("Drawing in the black color");
	}
}
