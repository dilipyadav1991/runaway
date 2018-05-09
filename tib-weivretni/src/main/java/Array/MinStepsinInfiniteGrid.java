//https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

package Array;

import java.util.ArrayList;

public class MinStepsinInfiniteGrid {
	public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
		int setSize = A.size();
		int minSteps = 0;
		int x = 0;
		int y = 0;
		for (int i = 1; i < setSize; i++) {
			x = Math.abs(A.get(i) - A.get(i - 1));
			y = Math.abs(B.get(i) - B.get(i - 1));
			minSteps += x > y ? x : y;
		}
		return minSteps;
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(1);
		A.add(1);
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(0);
		B.add(1);
		B.add(2);
		System.out.println(coverPoints(A, B));
	}

}
