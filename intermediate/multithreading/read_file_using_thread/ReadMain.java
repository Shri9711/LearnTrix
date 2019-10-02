package multithreading.read_file_using_thread;

public class ReadMain {
	public static void main(String[] args) {
		ReadUsingThread readFile = new ReadUsingThread();
		
//		String filePath = "C:\\Users\\cankush\\eclipse-workspace\\LearnTrixJava\\src\\file_handling\\input.txt";
		
		readFile.readFile();
	}
}
