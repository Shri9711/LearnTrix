package multithreading.RaceTest;

public class SharedTable {
	public static void main(String[] args){
		
	}
	
	synchronized void printtable(int n) { //method is not synchronized. Synchronized makes sure only one thread can execute the method at one time.
		for(int i = 1; i <= 5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}
}
