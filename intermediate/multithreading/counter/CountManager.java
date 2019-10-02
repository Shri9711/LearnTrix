package multithreading.counter;

public class CountManager {
	public static void main(String[] args) {
		SharedCounter shared = new SharedCounter();
		IncrementCounter increment = new IncrementCounter(shared);
		DecrementCounter decrement = new DecrementCounter(shared);
		
		increment.start();
		decrement.start();
	}
	
	
}
