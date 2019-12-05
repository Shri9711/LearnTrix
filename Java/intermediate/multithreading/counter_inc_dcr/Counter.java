package multithreading.counter_inc_dcr;

public class Counter extends Thread {
	public int counter;
	
	public void increment() {
		try {
			Thread.sleep(400);
			synchronized(this) {
				counter++;
				System.out.println(counter);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void decrement() {
		try {
			Thread.sleep(400);
			synchronized(this) {
				counter--;
				System.out.println(counter);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
