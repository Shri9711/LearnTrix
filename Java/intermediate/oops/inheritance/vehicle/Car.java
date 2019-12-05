package inheritance.vehicle;

public class Car extends Vehicle {
	String vehicleName = "Lamborghini";
	
	@Override
	public void drive() {
		System.out.println("Driving car " + super.vehicleName);
	}
	
	@Override
	public void drive(int speed) {
		System.out.println("Driving car with speed " + speed);
	}
}
