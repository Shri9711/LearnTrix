package lambda.use_lambda;
import java.util.ArrayList;

public class SquresUsingLambda {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(2);
		list.add(7);
		list.add(12);
		list.add(8);
		
		list.forEach(e -> System.out.println(e * e));
	}
}
