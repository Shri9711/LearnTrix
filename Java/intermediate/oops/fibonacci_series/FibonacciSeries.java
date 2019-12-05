package oops.fibonacci_series;

public class FibonacciSeries {
	int i = 0;
	int j = 1;
	int k = 0;
	public void fibo() {
			for (int a = 0; a < 20; a++) {
				System.out.println(k);
				
				i = j;
				j = k;
				k = i + j;
				
				//System.out.println(k);
		}
	}
}
