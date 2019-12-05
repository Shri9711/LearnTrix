package assignments.august31.total_vowel_and_consonant;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class FindTotalVowelsAndConsonents {
	Hashtable<Character, Integer> countVowel = new Hashtable<Character, Integer>();
	Hashtable<Character, Integer> countConsonents = new Hashtable<Character, Integer>();
	
	public void countVowels(String input) {
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
				if(countVowel.containsKey(input.charAt(i))) {
					Integer count = countVowel.get(input.charAt(i));
					count++;
					countVowel.put(input.charAt(i), count);
				} else {
					countVowel.put(input.charAt(i), 1);
				}
			}
		}
	}
	
	public void printNoOfVowels() {
		Set keys = countVowel.keySet();
		Iterator iterator = keys.iterator();
		int totalVowels = 0;
		
		while(iterator.hasNext()) {
			Character vowel = (Character) iterator.next();
			Integer count = countVowel.get(vowel);
			
			System.out.println(vowel + " " + count);
			totalVowels = totalVowels + count;
		}
		System.out.println("Total vowels in the string are : " + totalVowels);
	}
	
	public void printNoOfConsonents(String input) {
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) != 'a' || input.charAt(i) != 'e' || input.charAt(i) != 'i' || input.charAt(i) != 'o' || input.charAt(i) != 'u' || input.charAt(i) != ' ') {
				int flag = 0;
			} else {
				if(countConsonents.containsKey(input.charAt(i))) {
					Integer count = countConsonents.get(input.charAt(i));
					count++;
					countConsonents.put(input.charAt(i), count);
				} else {
					countConsonents.put(input.charAt(i), 1);
				}
			}
		}
		
		Set keys = countConsonents.keySet();
		Iterator iterator = keys.iterator();
		int totalConsonents = 0;
		
		while(iterator.hasNext()) {
			Character consonent = (Character) iterator.next();
			Integer count = countConsonents.get(consonent);
			
			System.out.println(consonent + " " + count);
			totalConsonents = totalConsonents + count;
		}
		System.out.println("Total consonents in the string are : " + totalConsonents);
	}
}
