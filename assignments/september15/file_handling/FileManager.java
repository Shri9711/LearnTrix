package assignments.september15.file_handling;
import java.util.Scanner;

public class FileManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String filePath = "C:\\Users\\cankush\\eclipse-workspace\\LearnTrixJava\\src\\file_handling\\data.txt";
		Write write = new Write();
		Read read = new Read();
		
		String data = scanner.nextLine();
		
		write.write(filePath, data);
		
		try {
			read.read(filePath);
		} catch(IllegalStateException e) {
			System.out.println("Exception occured ..");
		}
	}
}
