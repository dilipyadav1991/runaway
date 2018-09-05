// 
// Copied logic from https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

package Array;

import java.util.ArrayList;

public class LargestSumContiguous {
	public static ArrayList<Integer> findLargestSumContiguous(int a[]) {
		ArrayList<Integer> result = new ArrayList<>();
		int start = 0;
		int end = 0;
		int s = 0;
		int currMax = 0;
		int maxSoFar = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++){
			currMax += a[i];
			if(currMax < 0){
				currMax = 0;
				s = i + 1;
			}
			if(currMax > maxSoFar){
				maxSoFar = currMax;
				end = i;
				start = s;
			}
		}
		for(int i = start; i <= end; i++){
			result.add(a[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		ArrayList<Integer> max_sum = findLargestSumContiguous(a);
		System.out.println("Maximum contiguous sum is " + max_sum);
	}
}
