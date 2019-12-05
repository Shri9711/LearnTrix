package assignments;

public class AreaOfRectangle {
	
	public void area(int length, int breadth) {
		float area = length * breadth;
		System.out.println("The area of rectangle is " + area);
	}
	
	public void perimeter(int length, int breadth) {
		float area = 2*(length + breadth);
		System.out.println("The perimeter of rectangle is " + area);
	}
	
	public static void main(String[] args) {
		int length = 2;
		int breadth = 4;
		AreaOfRectangle area = new AreaOfRectangle();
		area.area(length, breadth);
		
		area.perimeter(length, breadth);
	}
}
