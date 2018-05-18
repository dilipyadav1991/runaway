package Other;

import java.util.ArrayList;

public class Factorials {
	public static ArrayList<Integer> printFactorials(int n) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				result.add(i);
				if (n / i != i) {
					result.add(n / i);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(printFactorials(10));
	}
}
