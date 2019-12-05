package file_handling.readfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileCapital {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\cankush\\eclipse-workspace\\LearnTrixJava\\src\\file_handling\\input.txt";
		
		File file = new File(filePath);
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				System.out.println(line.toUpperCase());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File is not available at : " + filePath);
		}
		
	}
}
