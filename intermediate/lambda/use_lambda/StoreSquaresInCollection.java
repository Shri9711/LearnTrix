package lambda.use_lambda;
import java.util.ArrayList;

public class StoreSquaresInCollection {
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 ArrayList<Integer> squares = new ArrayList<Integer>();
		 
		 list.add(5);
		 list.add(9);
		 list.add(4);
		 list.add(2);
		 list.add(17);
		 list.add(64);
		 
		 list.forEach(e -> squares.add(e * e));
		 System.out.println(squares);
	}
}
