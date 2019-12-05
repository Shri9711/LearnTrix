package class_;

public class Chair {
	int legs;
	boolean isFibreChair;
	boolean isWheelChair;
	
	public void typeOfChair(int legs, boolean isFibreChair, boolean isWheelChair) {
		if(legs == 4 && isFibreChair ) {
			System.out.println("Its a fibre chair");
		} else if(legs == 4 && isWheelChair) {
			System.out.println("Its a wheel chair");
		} else {
			System.out.println("The chair is broken");
		}
	}

}
