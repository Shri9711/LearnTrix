package multithreading;

public class MyThread implements Runnable {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new Thread(new MyThread());
		thread1.start();
		thread2.start();
		
		System.out.println("Thread names are following : ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
	}
	
	@Override
	public void run() {
		try {
				Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Inside thread");
	}
}
