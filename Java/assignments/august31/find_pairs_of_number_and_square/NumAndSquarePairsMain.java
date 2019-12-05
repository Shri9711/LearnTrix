package assignments.august31.find_pairs_of_number_and_square;

public class NumAndSquarePairsMain {
	public static void main(String[] args) {
		NumAndSquarePairs numSqPairs = new NumAndSquarePairs();
		
		Integer[] data = {11, 12, 13, 22, 11, 22, 24, 23, 35, 100, 200, 20, 121, 10, 1225};
		
		numSqPairs.numAndSquare(data);
	}
}
