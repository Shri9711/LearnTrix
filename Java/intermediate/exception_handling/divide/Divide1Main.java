package exception_handling.divide;

public class Divide1Main {

	public static void main(String[] args) /*throws Exception*/ {
		Divide1 divide1 = new Divide1();
		
		double num = 2;
		double den = 0;
		double result = 0;
		
		try {
			System.out.println("Before exception");
			result = divide1.divide(num, den);
			System.out.println("After exception");
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
