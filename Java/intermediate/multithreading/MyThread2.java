package multithreading;
import java.lang.Thread;

public class MyThread2 extends Thread {
	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		myThread.start();
		System.out.println("In main");
	}
	
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Printing the count : " + i );
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			System.out.println("My thread interrupted");
		}
		System.out.println("My thread run is over");
	}
}
