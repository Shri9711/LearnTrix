package assignments.august31.total_vowel_and_consonant;

public class FindTotalVowelsAndConsonentsMain {
	public static void main(String[] args) {
		FindTotalVowelsAndConsonents findVowels = new FindTotalVowelsAndConsonents();
		
		String input = "This is input string";
		
		findVowels.countVowels(input);
		findVowels.printNoOfVowels();
		findVowels.printNoOfConsonents(input);
	}
}
