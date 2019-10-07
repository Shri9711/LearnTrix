package multithreading.thread_wait;

public class Producer implements Runnable {

	private MyQueue myQueue;
	
	public Producer(MyQueue myQueue) {
		this.myQueue = myQueue;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized (myQueue) {
				myQueue.setMsg(name + " notifier work done");
				Thread.sleep(3000);
				//myQueue.notify(); //This gives only one notification
				myQueue.notifyAll(); //This will notifies all notifications
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
