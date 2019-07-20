package oops.prime;

public class Prime {
	boolean isPrime;

	public static boolean prime(int number) {
		if (number == 2) {
			return true;
		} else if(number>2 && number%2!=0)
		{
			for (int i = 3; i < number / 2; i+=2) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
