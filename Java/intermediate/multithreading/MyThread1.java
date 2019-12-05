package multithreading;
import java.lang.Thread;

public class MyThread1 implements Runnable {
	public static void main(String[] arsg) {
		Thread thread1 = new Thread(new MyThread1(), "My First Thread");
		Thread thread2 = new Thread(new MyThread1(), "My Second Thread");
		thread1.start();
		thread2.start();
		
		System.out.println("Thread names are following : ");
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
	}
	
	@Override
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

//The sequence of the output is different depending on how the CPU utilizes the thread
//The sequence might be changes for every execution