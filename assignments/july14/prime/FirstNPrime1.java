package assignments.prime;

public class FirstNPrime1 {
	int flag;
	int num = 2;
	int count = 1;
	
	public boolean firstNPrime(int no) {
		for(int k = 1; k < count; k++) {
			while(count < no) {
				if(num == 2) {
					System.out.println(num);
					num++;
					count++;
					return true;
				}
				for(int i = 2; i <= Math.sqrt(num); i+=2) { //it also work for i++
					if(num % i == 0) {
						flag = 1;
						return false;
					} else {
						flag = 0;
						System.out.println(num);
					}
					count++;
					num++;
				}
			}
		}
		return true;
	}
}
