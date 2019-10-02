package collection.sort;

import java.util.Comparator;

public class SortArrayListDesc implements Comparator<Integer>{

	public int compare(Integer first, Integer second) {
		return first <= second ? 1 : -1;
	}
}
