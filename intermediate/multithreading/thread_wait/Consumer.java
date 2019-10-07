package multithreading.thread_wait;

public class Consumer implements Runnable {
	private MyQueue myQueue;
	
	public Consumer(MyQueue myQueue) {
		this.myQueue = myQueue;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized(myQueue) {
			try {
				System.out.println(name + " wating to get notified at time: " + System.currentTimeMillis());
				myQueue.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " waiter thread get notified at time: " + System.currentTimeMillis());
			//process this message now
			System.out.println(name + " processed: " + myQueue.getMsg());
		}
	}
}
