package basic;

public class Calculation {
	//variables declared here
	int num1;
	int num2;
	int result;
	
	public void add(int num1, int num2) { //method to perform arithmetic operations
		result = num1 + num2;
		System.out.println("The addition of " + num1 + " and " + num2 + " is " + result);
		System.out.println("The addition of " + num1++ + " and " + num2 + " is " + result);
		System.out.println("num1 is " + num1);
		result = num1 + num2;
		System.out.println("The addition of " + num1 + " and " + num2 + " after increment is " + result);
		
		result = num1 - num2;
		System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + result);
		result = num1 * num2;
		System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + result);
		result = num1 / num2;
		System.out.println("The division of " + num1 + " and " + num2 + " is %f" + (float) (num1)/(num2));
	}

	public static void main(String[] args) {
		Calculation calculate = new Calculation();
		calculate.add(2, 3);
	}

}
