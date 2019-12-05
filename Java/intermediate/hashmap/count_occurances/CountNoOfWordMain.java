package hashmap.count_occurances;

public class CountNoOfWordMain {
	public static void main(String[] args) {
		CountNoOfWords count = new CountNoOfWords();
		
		String input = "This is This is test test test string";
		String in = "Hello h h hi h i hi hi h hi hi";
		
		count.countNoOfWords(input);
		count.printCounts();
		
		count.maxOccuredWord(input);
		
		count.countNoOfWords(in);
		count.maxOccuredWord(in);
	}
}
