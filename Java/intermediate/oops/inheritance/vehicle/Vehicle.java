package inheritance.vehicle;

public class Vehicle {
	String vehicleName = "Mercedeze"; //If we make this variable private, then it is unaccessible in derived class
	
	public void drive() {
		System.out.println("Driving vehicle");
	}
	
	public void drive(int speed) {
		System.out.println("Driving car with speed : " + speed);
	}
}
