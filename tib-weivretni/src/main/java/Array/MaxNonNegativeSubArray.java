// Question: https://www.interviewbit.com/problems/max-non-negative-subarray/
//Solution Copied from: https://gateoverflow.in/58813/max-non-negative-subarray-problem-solution

package Array;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
	public static ArrayList<Integer> sizeOfMaxNonNegativeSubArray(final ArrayList<Integer> a) {
		long maxSum = 0;
	    long newSum = 0;
	    ArrayList<Integer> maxArray = new ArrayList<Integer>();
	    ArrayList<Integer> newArray = new ArrayList<Integer>();
	    for (Integer i : a) {
	        if (i >= 0) {
	            newSum += i;
	            newArray.add(i);
	        } else {
	            newSum = 0;
	            newArray = new ArrayList<Integer>();
	        }
	        if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
	            maxSum = newSum;
	            maxArray = newArray;
	        }
	    }
	    return maxArray;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(-7);
		list.add(2);
		list.add(3);
		System.out.println(sizeOfMaxNonNegativeSubArray(list));
	}
}
