package hashmap.directory_using_enumeration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import hashmap.Directory;

public class DirectoryUsingEnumeration {
	@SuppressWarnings("rawtypes")
	private Hashtable<String, String> myDirectory = new Hashtable<String, String>();
	
	public void addEntry(String name, String phoneNumber) {
		myDirectory.put(name, phoneNumber);
	}
	
	public void printDirectory() {
		/*Set keys = (Set) myDirectory.keys();

		String name = keys.toString();
		String phoneNumber = myDirectory.get(name).toString();
		System.out.println("Name : " + name + " | " + "Phone Number : " + phoneNumber);*/
		
		Enumeration enumeration = myDirectory.keys();
		
		while(enumeration.hasMoreElements()) {
			String name = enumeration.nextElement().toString();
			String phoneNumber = myDirectory.get(name).toString();
			System.out.println("Name : " + name + " | " + "Phone Number : " + phoneNumber);
		}
		
	}
	
	public static void main(String[] args) {
		Directory directory = new Directory();
		
		directory.addEntry("Ankush", "9976788876");
		directory.addEntry("Shreyas", "7654747774");
		directory.addEntry("Kuldeep", "9774777899");
		directory.addEntry("Rutuj", "9746637888");
		directory.addEntry("Prathamesh", "6374677476");
		
		directory.printDirectory();
	}
}
