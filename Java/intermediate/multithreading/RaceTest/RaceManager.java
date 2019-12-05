package multithreading.RaceTest;

public class RaceManager {
	public static void main(String[] args) {
		SharedTable mySharedTable = new SharedTable();
		
		FirstRace firstRace = new FirstRace(mySharedTable);
		SecondRace secondRace = new SecondRace(mySharedTable);
		
		firstRace.start();
		secondRace.start();
	}
}
