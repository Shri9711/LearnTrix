package oops.prime;

public class FindPrime {
	int flag = 0;
	
	public boolean findPrime(double num) {
		if(num == 2) {
			System.out.println("It is the prime number");
			return true;
		}
		for(int i = 2; i <= Math.sqrt(num); i+=2) { //it also work for i++
			if(num % i == 0) {
				flag = 1;
				return false;
			} else {
				flag = 0;
			}
		}
		return true;
	}
}
