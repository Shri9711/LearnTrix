package assignments.factorial;

public class NFactorial {

	public int Fact(int num) {
		if (num == 1) {
			return 1;
		} else {
			return (num * (Fact(num - 1)));
		}
	}

}
