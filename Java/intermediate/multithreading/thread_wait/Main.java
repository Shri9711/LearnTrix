package multithreading.thread_wait;

public class Main {
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue("Process it");
		Consumer consumer1 = new Consumer(myQueue);
		new Thread(consumer1, "consumer1").start();
		
		Consumer consumer2 = new Consumer(myQueue);
		new Thread(consumer2, "consumer2").start();
		
		Producer producer = new Producer(myQueue);
		new Thread(producer, "producer").start();
		
		System.out.println("All the threads are started");
	}
}
