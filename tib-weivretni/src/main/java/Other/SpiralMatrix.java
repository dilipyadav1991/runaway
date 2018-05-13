//http://gdevtest.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
package Other;

public class SpiralMatrix {
	public static void main(String[] args) {
		int R = 4;
		int C = 2;
		int a[][] = { { 1, 2}, 
					  { 7, 8}, 
					  { 13, 14},
					  { 19, 20}
					};
		spiralPrint(R - 1, C - 1, a);
	}

	private static void spiralPrint(int endingRowIndex, int endingColumnIndex, int[][] a) {
		int startingRowIndex = 0;
		int startingColumnIndex = 0;
		int index;
		while (startingColumnIndex <= endingColumnIndex && startingRowIndex <= endingRowIndex) {
			// Print first row
			for (index = startingColumnIndex; index <= endingColumnIndex; index++) {
				System.out.print(a[startingRowIndex][index] + " ");
			}
			startingRowIndex++;
			// Print last column
			for (index = startingRowIndex; index <= endingRowIndex; index++) {
				System.out.print(a[index][endingColumnIndex] + " ");
			}
			endingColumnIndex--;

			if(startingRowIndex <= endingRowIndex){
				for (index = endingColumnIndex; index >= startingColumnIndex; index--) {
					System.out.print(a[endingRowIndex][index] + " ");
				}
			}
			endingRowIndex--;
			
//			if(startingColumnIndex <= endingColumnIndex){
				for(index = endingRowIndex; index >= startingRowIndex; index--){
					System.out.print(a[index][startingColumnIndex] + " ");
				}
//			}
			startingColumnIndex++;
		}
	}

}
