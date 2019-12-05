package java_generics.advance;
import java.util.ArrayList;

public class AddTemplate<T> {
	private ArrayList<T> arrayT = new ArrayList<T>();
	
	public ArrayList<T> get() {
		return this.arrayT;
	}
	
	public void set (ArrayList<T> t) {
		this.arrayT = t;
	}
	
	public void add(T t) {
		this.arrayT.add(t);
	}
	
	public void printAll() {
		System.out.println(arrayT);
	}
	
	public static void main(String[] args) {
		AddTemplate<String> stringTemplate = new AddTemplate<String>();
		
		stringTemplate.add("Ankush");
		stringTemplate.add("Rutuj");
		//stringTemplate.add(9); throws error
		
		stringTemplate.printAll();
	}
}
