package multithreading.counter;

public class IncrementCounter extends Thread {
	SharedCounter c;
	
	IncrementCounter(SharedCounter c) {
		this.c = c;
	}
	
	public void run() {
		int[] array = {1, 2, 3, 4, 5};
		c.counter(array);
		
//		for(int i = 0; i <= array.length; i++) {
//			System.out.println(i+1);
//			try {
//				Thread.sleep(400);
//			} catch (InterruptedException e) {
//				System.err.println(e);
//			}
//		}
	}
}
