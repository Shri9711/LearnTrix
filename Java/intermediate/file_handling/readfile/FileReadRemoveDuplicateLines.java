package file_handling.readfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class FileReadRemoveDuplicateLines {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\cankush\\eclipse-workspace\\LearnTrixJava\\src\\file_handling\\input.txt";
		
		File file = new File(filePath);
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		@SuppressWarnings("unused") //added to remove warning that shows flag is unused
		int flag = 0;
		
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				lhset.add(line);
			}
			Object[] lines = lhset.toArray();
			for(int i = 0; i < lines.length; i++) {
				System.out.println(lines[i]);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.err.println("File is not available at : " + filePath);
		}
		
	}
}
