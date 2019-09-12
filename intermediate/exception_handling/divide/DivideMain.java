package exception_handling.divide;

public class DivideMain {
	public static void main(String[] args) {
		Divide divide = new Divide();
		double num = 5;
		double den = 0;
		
		double result = divide.divide(num, den);
		System.out.println("Division is " + result);
	}
}
