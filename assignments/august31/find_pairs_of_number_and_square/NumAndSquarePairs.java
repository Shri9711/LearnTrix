package assignments.august31.find_pairs_of_number_and_square;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class NumAndSquarePairs {
	public void numAndSquare(Integer[] data) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		Hashtable<Integer, Integer> myHash = new Hashtable<Integer, Integer>();
		
		int num;
		
		for(int i = 0; i < data.length; i++) {
			arraylist.add(data[i]);
		}
		
		for(int i = 0; i < arraylist.size(); i++) {
			int square = arraylist.get(i) * arraylist.get(i);
			if(arraylist.contains(square)) {
				myHash.put(arraylist.get(i), square);
			}
		}
		
		Set keys = myHash.keySet();
		Iterator iterator = keys.iterator();
		int totalPairs = 0;
		
		while(iterator.hasNext()) {
			Integer number = (Integer) iterator.next();
			Integer square = myHash.get(number);
			
			System.out.println(number + " " + square);
			totalPairs = totalPairs + 1;
		}
		System.out.println("Total pairs of number and square in the array are : " + totalPairs);
	}
}
