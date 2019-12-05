package hashmap.count_occurances;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CountNoOfWords {
	HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
	
	public void countNoOfWords(String input) {
		int count = 1;
		
		String[] arr = input.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			if(wordCount.containsKey(arr[i])) {
				Integer key = wordCount.get(arr[i]);
				key++;
				wordCount.put(arr[i], key);
			} else {
				wordCount.put(arr[i], count);
			}
		}
	}
	
	public void printCounts() {
		System.out.println(wordCount);
	}
	
	public void maxOccuredWord(String input) {
		Set keys = wordCount.keySet();
		Iterator iterator = keys.iterator();
		String maxWord = iterator.next().toString();
		
		while(iterator.hasNext()) {			
			String word = iterator.next().toString();
			Integer count = wordCount.get(word);
			
			if(wordCount.get(maxWord) < wordCount.get(word)) {
				maxWord = word;
			}
		}
		System.out.println("The maximun occured word in the string is " + maxWord);
	}
}
