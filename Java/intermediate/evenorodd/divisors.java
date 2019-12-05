package evenorodd;

public class divisors {
	int num;
	int flag;
	int even = 0;
	int odd = 0;
	static int i;
	
	public void divisor(int num) {
		for(i = 1; i <= num; i++) {
			if(isDivisible(num, i)) {
				System.out.println(i);
				if(isEven(i)) {
					even++;
				} else {
					odd++;
				}
			}
		}
		System.out.println("Even divisors are : " + even);
		System.out.println("Odd divisors are : " + odd);
	}
	
	public static boolean isDivisible(int num, int i) {
		if(num % i == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isEven(int i) {
		if(i % 2 == 0) {
			return true;
		}
		return false;
	}
}
