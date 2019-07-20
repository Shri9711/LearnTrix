package PrimeFactorsOfANumber;
import evenorodd.*;
import oops.prime.*;
/*Program to find all prime factors of the number*/

public class primeFactors {
	int count = 0;
	
	public void findPrimeFact(int num) {
		System.out.println("The prime factors are : ");
		for(int i = 1; i <= num; i++) {
			if(divisors.isDivisible(num, i)) {
				if(Prime.prime(i)) {
					System.out.println(i);
					count++;
				}
			}
		}
		System.out.println("There are " + count + " prime factors for " + num);
	}
}
