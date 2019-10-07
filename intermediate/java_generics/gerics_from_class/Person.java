package java_generics.gerics_from_class;

public class Person<String, Integer> {
	String name;
	int age;
	
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getPersonName() {
		return name;
	}
	
	public int getPersonAge() {
		return age;
	}
}
