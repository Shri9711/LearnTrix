package assignments.august31.arraylist;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;

public class FindEmp {
	LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
	
	public void findEmp(String data) {
		String[] data1 = data.split(" \n ");
				
		for(int i = 0; i < data1.length; i++) {
			 String[] data3 = data1[i].split(" ");
			 hashMap.put(data3[0], Integer.valueOf(data3[1]));
		}
		
		Set keys = hashMap.keySet();
		Iterator iterator = keys.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next().toString();
			int salary = hashMap.get(name);
			
			if(salary >= 200 && salary <= 300) {
				System.out.println(name + " " + hashMap.get(name));
			}
		}
	}
}
