package oops.prime;

public class PrimeMain {
	public static void main(String[] args) {
		Prime prime = new Prime();
		
		prime.isPrime=prime.prime(937);
		//System.out.println(prime.isPrime);
		
		FirstNPrime nprime = new FirstNPrime();
		
		//nprime.nPrime();
		
		FindPrime findPrime = new FindPrime();
		
		System.out.println(findPrime.findPrime(5));
	}
}
