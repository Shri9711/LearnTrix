package collection.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(2);
		list.add(100);
		list.add(48);
		list.add(34);
		
		Collections.sort(list, new SortArrayListDesc());
		
		System.out.println(list);
	}
}
