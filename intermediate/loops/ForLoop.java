package loops;

public class ForLoop {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("***************************");
		
		for(int i = 10; i > 0; i++) {
			//System.out.println(i); //This gives infinite outputs as condition is not terminated
		}
		
		System.out.println("***************************");
		
		for(int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
			System.out.println(i);
			System.out.println(j);
		}
		
		System.out.println("***************************");
		
		for(int i = 10, j = 5; i > 0 && j > 0; i--, j--) {
			System.out.println(i * j);
		}
		
		System.out.println("***************************");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
		}
	}
}
