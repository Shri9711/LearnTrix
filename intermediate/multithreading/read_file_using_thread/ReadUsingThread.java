package multithreading.read_file_using_thread;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import multithreading.MyThread2;

public class ReadUsingThread extends Thread {
	public void readFile() {
		ReadUsingThread readFi = new ReadUsingThread();
		readFi.start();
		
	}
	
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		String filePath = scan.nextLine();
		
		File file = new File(filePath);
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String lines = scanner.nextLine();
					
				System.out.println(lines);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist at : " + filePath);
		} finally {
			scanner.close();
		}
	}
}
