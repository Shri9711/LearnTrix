package inheritance.vehicle;

public class VehicleManager {
	public static void main(String[] args) {
		int speed = 60;
		
		Vehicle car = new Car();
		car.drive();
		car.drive(speed);
		
		Vehicle bike = new Bike();
		bike.drive();
	}
}
