package Revision;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
	int a[] = { 1, -2, 2, 3, -3, 5, -6, 4 };

	public void findMaxArray() {
		int len = a.length;
		int newSum = 0;
		int maxSum = 0;
		ArrayList<Integer> newArray = new ArrayList<>();
		ArrayList<Integer> maxArray = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			if (a[i] > 0) {
				newArray.add(a[i]);
				newSum += a[i];
			} else {
				newArray = new ArrayList<>();
				newSum = 0;
			}
			if (newSum > maxSum || (newSum == maxSum && newArray.size() > maxArray.size())) {
				maxSum = newSum;
				maxArray = newArray;
			}
		}
		System.out.println(maxArray);
	}

	public static void main(String[] args) {
		MaxNonNegativeSubArray array = new MaxNonNegativeSubArray();
		array.findMaxArray();
	}

}
