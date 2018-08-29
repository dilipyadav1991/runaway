// 
// Copied logic from https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

package Array;

import java.util.ArrayList;

public class LargestSumContiguous {
	public static ArrayList<Integer> findLargestSumContiguous(int a[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int start = 0;
		int end = 0;
		int x = 0;
		int maxSoFar = Integer.MIN_VALUE;
		int currentMax = 0;
		for (int i = 0; i < a.length; i++) {
			currentMax += a[i];
			if (maxSoFar < currentMax) {
				maxSoFar = currentMax;
				start = x;
				end = i;
			}
			if (currentMax < 0) {
				currentMax = 0;
				x = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is " + maxSoFar);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
		for (int i = start; i <= end; i++) {
			list.add(a[i]);
		}
		return list;
	}

	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		ArrayList<Integer> max_sum = findLargestSumContiguous(a);
		System.out.println("Maximum contiguous sum is " + max_sum);
	}
}
