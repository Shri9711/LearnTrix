package basic;

public class LogicalOperators {
	boolean isStudent;
	boolean isGirl;
	boolean isWednesday;
	boolean isIndian;
	boolean isDiscount;
	
	public boolean discount(boolean isStudent, boolean isGirl, boolean isWednesday, boolean isIndian) {		
		if (isIndian || isStudent && isGirl && isWednesday) {
			System.out.println("Congrats! you have got 40% discount");
			isDiscount = true;
		} else {
			System.out.println("Congrats! You have got 20% discount");
			isDiscount = false;
		}
		
		return isDiscount;
	}
	
	public static void main(String[] args) {
		LogicalOperators jack = new LogicalOperators();
		System.out.println(jack.discount(true, false, true, false));
		
		LogicalOperators jim = new LogicalOperators();
		System.out.println(jim.discount(true, true, true, false));
		
		//madhav is an Indian, not a student, not a girl and is does not do shopping on Wednesday 
		LogicalOperators madhav = new LogicalOperators();
		System.out.println(madhav.discount(false, false, false, true));
	}
}
