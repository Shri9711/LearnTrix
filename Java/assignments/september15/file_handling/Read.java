package assignments.september15.file_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
	public void read(String filePath) {
		File file = new File(filePath);
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String lines = scanner.nextLine();
				
				System.out.println(lines);
				
				scanner.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fie not found at " + filePath);
		}
		
	}
}
