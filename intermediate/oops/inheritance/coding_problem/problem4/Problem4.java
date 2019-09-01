package inheritance.coding_problem.problem4;

public class Problem4 {
	static int i = 111;
	int j = 222;
	
	{
		i = i++ - ++j;
		System.out.println(i);
	}
}

class probl extends Problem4 {
	{
		i = i-- + --j;
		System.out.println(j);
	}
}
