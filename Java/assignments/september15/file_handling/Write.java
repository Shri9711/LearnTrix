package assignments.september15.file_handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {
	public void write(String filePath, String data) {
		File file = new File(filePath);
		
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			printWriter.println(data);
			
			printWriter.close();
			fileWriter.close();
			
		} catch (IOException e) {
			System.out.println("File is notn found at " + filePath);
		}
	}
}
