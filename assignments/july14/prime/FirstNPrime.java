package assignments.prime;

public class FirstNPrime {

	//Java program to find prime numbers from first 100 numbers
	public void nPrime() {
		for(int j = 1; j < 99; j++) {
			if (j == 2) {
				System.out.println(j);
			} else if(j > 2 && j % 2 != 0){
				for (int i = 3; i < j / 2; i += 2) {
					if (j % i == 0) {
						j = j + 1;
					}
				}
				if(j % 2 != 0) {
					System.out.println(j);
				}
			}
		}
	}
}
