package file_handling.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileAlternateUpperLowerCase {
	@SuppressWarnings("static-access") //added just to remove warnings given at line number 22 and 25.
	public static void main(String[] args) {
		String filePath = "C:\\Users\\cankush\\eclipse-workspace\\LearnTrixJava\\src\\file_handling\\input.txt";
		
		File file = new File(filePath);
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				for(int i = 0; i < line.length(); i++) {
					if(i % 2 == 0) {
						Character a = line.charAt(i);
						System.out.print(a.toUpperCase(a));
					} else {
						Character a = line.charAt(i);
						System.out.print(a.toLowerCase(a));
					}
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File is not available at : " + filePath);
		}
		
	}
}
