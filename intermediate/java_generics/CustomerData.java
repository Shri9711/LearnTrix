package java_generics;
import java.util.*;

public class CustomerData {
	Map<String, List<String>> phoneBook = new HashMap<String, List<String>>();
	List<String> contactNo = new ArrayList<String>();
	Scanner scanner = new Scanner(System.in);
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void customerData() {
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("how many number do you have?");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the number");
		for(int i = 0; i < n; i++) {
			String num = scanner.nextLine();
			contactNo.add(num);
		}
		phoneBook.put(name, (ArrayList) contactNo);
	}
	
	public Map<String, List<String>> getCustomerData() {
		return phoneBook;
	}
}
