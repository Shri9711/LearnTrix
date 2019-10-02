package multithreading.counter;

public class SharedCounter {
	synchronized void counter(int[] array) {
		for(int i = 0; i <= array.length; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}
}
