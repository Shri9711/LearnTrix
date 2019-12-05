package assignments;

public class WorldCupMatch {
	boolean isWorldCupFinal;
	boolean notRaining;
	boolean isToss;
	boolean isMatch;
	
	public boolean match(boolean isWorldCupFinal, boolean notRaining, boolean isToss) {
		if (isWorldCupFinal && notRaining && isToss) {
			System.out.println("The match will start in am moment...");
			isMatch = true;
		} else{
			System.out.println("Its raining. Match will start when it stops raining!");
			isMatch = false;
		}
		return isMatch;
	}
	
	public static void main(String[] args) {
		WorldCupMatch wcfinal = new WorldCupMatch();
		wcfinal.match(true, true, true);
		
		wcfinal.match(true, false, true);
		
		wcfinal.match(true, false, false);
	}
}
