package abstraction.add;

public class AddMain {
	public static void main(String[] args) {
		Add add;
		add = new AddTwoNum();
		
		add.add(2, 4);
	}
}