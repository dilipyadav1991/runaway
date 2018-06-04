package Other;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {
	public static int repeatedNumber(final List<Integer> a) {
		int min = 0;
		int size = a.size();
		for (int i = 0; i < size + 1; i++) {
		}
		return min;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		a.add(1);
		a.add(4);
		a.add(1);
		System.out.println(repeatedNumber(a));
	}
}
