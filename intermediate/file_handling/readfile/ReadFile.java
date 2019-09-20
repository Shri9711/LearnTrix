package file_handling.readfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public void read(String filePath) {
		
		File file = new File(filePath);
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.err.println("File is not available at : " + filePath);
		}
	}
	
	public static void main(String[] args) {
		String filePath = "C:\\\\Users\\\\cankush\\\\eclipse-workspace\\\\LearnTrixJava\\\\src\\\\file_handling\\\\input.txt";
		ReadFile rf = new ReadFile(); 
	}
}
