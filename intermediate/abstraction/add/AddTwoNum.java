package abstraction.add;

public class AddTwoNum extends Add {
	
		@Override
		public void add(int num1, int num2) {
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
		}
}
