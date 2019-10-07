package java_generics.gerics_from_class;
import java.util.*;

public class AddItem {
	
	List<Integer> list = new ArrayList<Integer>();
	
	public void add() {
		list.add(2);
		list.add(4);
		list.add(5);
	}
	
	public void print() {
		for(int i : list) {
			System.out.println(list.get(i));
		}
	}
	
	public static void main(String[] args) {
		AddItem items = new AddItem();
		
	}
}
