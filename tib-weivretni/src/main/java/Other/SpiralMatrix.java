//http://gdevtest.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
package Other;

import java.util.Stack;

public class SpiralMatrix {
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		int R = 4;
		int C = 2;
		int a[][] = { { 1, 2 }, { 7, 8 }, { 13, 14 }, { 19, 20 } };
		spiralPrint(R - 1, C - 1, a);
		System.out.println();
		antiSpiral();
	}

	private static void antiSpiral() {
		do {
			System.out.print(stack.pop() + " ");
		} while (!stack.isEmpty());
	}

	private static void spiralPrint(int endingRowIndex, int endingColumnIndex, int[][] a) {
		int startingRowIndex = 0;
		int startingColumnIndex = 0;
		int index;
		while (startingColumnIndex <= endingColumnIndex && startingRowIndex <= endingRowIndex) {
			// Print first row
			for (index = startingColumnIndex; index <= endingColumnIndex; index++) {
				System.out.print(a[startingRowIndex][index] + " ");
				stack.add(a[startingRowIndex][index]);
			}
			startingRowIndex++;
			// Print last column
			for (index = startingRowIndex; index <= endingRowIndex; index++) {
				System.out.print(a[index][endingColumnIndex] + " ");
				stack.add(a[index][endingColumnIndex]);
			}
			endingColumnIndex--;

			if (startingRowIndex <= endingRowIndex) {
				for (index = endingColumnIndex; index >= startingColumnIndex; index--) {
					System.out.print(a[endingRowIndex][index] + " ");
					stack.add(a[endingRowIndex][index]);
				}
			}
			endingRowIndex--;

			// if(startingColumnIndex <= endingColumnIndex){
			for (index = endingRowIndex; index >= startingRowIndex; index--) {
				System.out.print(a[index][startingColumnIndex] + " ");
				stack.add(a[index][startingColumnIndex]);
			}
			// }
			startingColumnIndex++;
		}
	}

}
