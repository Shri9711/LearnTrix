package interface_.problems;

public interface A {
	public final int i = 111; //If we written this as "int i = 111" then also it is of type public final
}

class B implements A {
	void methodB() {
		//i = 222; //This is not allowed because the interface by default makes variables final and constant;
	}
}
