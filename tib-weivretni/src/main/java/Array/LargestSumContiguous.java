// 
// Copied logic from https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

package Array;

public class LargestSumContiguous {
	public static int findLargestSumContiguous(int a[]) {
		int maxSoFar = a[0];
		int currentMax = a[0];
		for (int i = 1; i < a.length; i++) {
			int sum = currentMax + a[i];
			currentMax = sum > a[i] ? sum : a[i];
			maxSoFar = maxSoFar > currentMax ? maxSoFar : currentMax;
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = a.length;
		int max_sum = findLargestSumContiguous(a);
		System.out.println("Maximum contiguous sum is " + max_sum);
	}
}
