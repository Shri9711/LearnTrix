package file_handling.writefile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
	public void write(String filePath, String data)	 {
		File file = new File(filePath);
		
		try {
			FileWriter fileWriter = new FileWriter(file, true); //writing true to append the data
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			printWriter.println(data);
			
			printWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			System.err.println("File not available at : " + file);
		}
	}
	
	public static void main(String[] args) {
		WriteToFile write = new WriteToFile();
		String filePath = "C:\\Users\\cankush\\eclipse-workspace\\LearnTrixJava\\src\\file_handling\\output.txt";
		String data = "This file is written using java code";
		
		write.write(filePath, data);
	}
}
