package multithreading.RaceTest;

public class FirstRace extends Thread {
	SharedTable t;
	
	public static void main(String[] args) {
		
	}

	FirstRace(SharedTable t) {
		this.t = t;
	}
	
	public void run() {
		t.printtable(5);
	}
}
