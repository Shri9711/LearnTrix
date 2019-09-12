package exception_handling.divide;

public class Divide1 {
	public double divisionCaller(double num, double den) throws Exception{
		double result = 0;
		try {
			result = divide(num, den);
		} catch(Exception ex) {
			return result;
		}finally {
			System.out.println("In the finally - divisionCaller");
		}
		return result;
	}
	
	public double divide(double num, double den) throws Exception{
		
		double result = 0;
		
			if(den == 0 ) {
				throw new Exception("Denominator cannot be zero"); //when exception occurs then the code after the exception is not going to execute.
			}
			
		return result;
	}
}
