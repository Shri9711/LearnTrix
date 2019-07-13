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
		
		System.out.println("***************************");
		
//		for( ; ;) {
//			//System.out.println("cankush"); //This gives infinite output as there is no condition
//		}
		
		System.out.println("***************************");
		
//		for(int i = 10; ; i++) {
//			//System.out.println(i); //This is gives infinite output
//		}
		
		System.out.println("***************************");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i++);
		}
		
		System.out.println("***************************");
		
		for(int i = 0; i < 10;) {
			System.out.println(i++);
		}
		
		System.out.println("***************************");
		
		for(int i = 0; i < 9;) {
			System.out.println(++i);
		}
		
		System.out.println("***************************");
		
//		for(int i = 0; i < 10;) {
//			//System.out.println(++i++); //This doesnt work
//		}
		
		System.out.println("***************************");
		
//		for(int i = 0; i < 10; i++) {
//			//System.out.println((++i)++); //This is also doesnt work
//		}
		
		System.out.println("***************************");
		
		for(int i = 0; i < 10; i+=5) { //i = i + 5 is equal to i += 5
			System.out.println(i);
		}
	}
}
