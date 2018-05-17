//https://www.geeksforgeeks.org/duplicates-array-using-o1-extra-space-set-2/

package Array;

import java.util.ArrayList;

public class DuplicatesInArray {
	public static ArrayList<Integer> findDuplicate(int a[]) {
		ArrayList<Integer> result = new ArrayList<>();
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int index = a[i] % n;
			a[index] = a[index] + n;
		}
		for (int i = 0; i < n; i++) {
			if (a[i] / n > 1) {
				result.add(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(findDuplicate(new int[] { 0, 1, 0, 2, 2 }));
	}

}
