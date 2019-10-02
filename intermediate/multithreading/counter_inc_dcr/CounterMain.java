package multithreading.counter_inc_dcr;
import java.lang.Thread;

public class CounterMain extends Thread {
		Counter c;
		
		CounterMain(Counter c) {
			this.c = c;
		}
		
		public void run() {
			c.increment();
			c.decrement();
		}
		
		public static void main(String[] args) {
			Counter counter = new Counter();
			
			CounterMain main1 = new CounterMain(counter);
			CounterMain main2 = new CounterMain(counter);
			CounterMain main3 = new CounterMain(counter);
			
			main1.start();
			main2.start();
			main3.start();
		}
}
