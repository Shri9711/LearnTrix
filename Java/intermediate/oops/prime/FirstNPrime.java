package oops.prime;
import java.util.Scanner;

public class FirstNPrime {
	Scanner scanner = new Scanner(System.in);
	boolean isPrime;
	int count = 0;
	int n = 10;

	public void nPrime() {
		//System.out.println("Enter the number of prime numbers you want to print");
		//n = scanner.nextInt();
		//while(count < n) {
			for(int j = 1; j < 99; j++) {
				if (j == 2) {
					System.out.println(j);
				} else if(j > 2 && j % 2 != 0){
					for (int i = 3; i < j / 2; i += 2) {
						if (j % i == 0) {
							//return false;
							j = j + 1;
						}
					}
					if(j % 2 != 0) {
					System.out.println(j);
					}
				}
				//return false;
			}
			//count++;
		//}
		//return true;
	}
}
