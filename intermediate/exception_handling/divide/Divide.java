package exception_handling.divide;

public class Divide {
	public double divide(double num, double den) {
//		double divide = num / den;
//		System.out.println(divide);
//		divide(num, den);//this gives StackOverflowError
//		System.out.println("Memory is full!");
		
		double result = 0;
		
		try {
			System.out.println("Before exception");
			if(den == 0 ) {
				throw new Exception("Denominator cannot be zero"); //when exception occurs then the code after the exception is not going to execute.
			}
			System.out.println("After exception");
			result = (double)(num / den);
			
			return result;
		} catch(Exception ex) {
			System.out.println("Please ensure that denominator is non-zero");
			System.out.println(ex.getMessage());
		}
		return result;
	}
}
