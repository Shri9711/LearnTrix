package java_generics.advance;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class ExtendsTemplate<T extends Map> {
	
	HashMap value;
	
	public void setValue(HashMap hashMap) {
		this.value = hashMap;
	}
	
	public HashMap getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		ExtendsTemplate<HashMap> arrayListTemplate = new ExtendsTemplate<HashMap>();
		
		//arrayListTemplate.setValue(new ArrayList()); //if HashMap and T extends Map taken then this gives error
		arrayListTemplate.setValue(new HashMap()); //if ArrayList and T extends List taken then this gives error
	}
}
