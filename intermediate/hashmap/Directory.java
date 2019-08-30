package hashmap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Directory {
	@SuppressWarnings("rawtypes")
	private Hashtable<String, String> myDirectory = new Hashtable<String, String>();
	
	public void addEntry(String name, String phoneNumber) {
		myDirectory.put(name, phoneNumber);
	}
	
	public void printDirectory() {
		Set keys = myDirectory.keySet();
		Iterator iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next().toString();
			String phoneNumber = myDirectory.get(name).toString();
			System.out.println("Name : " + name + " | " + "Phone Number : " + phoneNumber);
		}
		
		for(int i = 0; i < myDirectory.size(); i++) {
			String name = myDirectory.keys().nextElement().toString();
//			System.out.println("Name : " + name + " | " + " Phone Number : " + myDirectory.get(name));
		}
	}
	
	public static void main(String[] args) {
		Directory directory = new Directory();
		
		directory.addEntry("Ankush", "9976788876");
		directory.addEntry("Shreyas", "7654747774");
		directory.addEntry("Kuldeep", "9774777899");
		directory.addEntry("Rutuj", "9746637888");
		directory.addEntry("Prathamesh", "6374677476");
		directory.addEntry("Ankush", "9867567687"); //if we enter duplicate entry then the value that entered lastly is replaced.
		
		directory.printDirectory();
	}
}