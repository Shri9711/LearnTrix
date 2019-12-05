package multithreading.RaceTest;

public class SecondRace extends Thread {
	SharedTable t;
	
	public static void main(String[] args) {
		
	}

	SecondRace(SharedTable t) {
		this.t = t;
	}
	
	public void run() {
		t.printtable(4);
	}
}
