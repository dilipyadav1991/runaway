package Array;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
	public static ArrayList<Integer> sizeOfMaxNonNegativeSubArray(final ArrayList<Integer> list) {
		ArrayList<Integer> result = new ArrayList<>();
		int sizeOfMaxNonNegativeSubArray = 0;
		int maxSegmentLength = 0;
		int minimumStartingElement = list.get(0);
		int indexOfMinimumStartingElementIndex = -1;
		boolean firstTime = true;
		int listSize = list.size();
		int x = 0;
		int y = 0;
		int minStartingElement = 0;
		for (int i = 0; i < listSize; i++) {
			int segmentLength = 0;
			if (list.get(i) > 0) {
				minStartingElement = list.get(i);
			}
			int sum = 0;
			while (i < listSize && list.get(i) >= 0) {
				int num = list.get(i);
				if (firstTime) {
					minStartingElement = num;
					if (minStartingElement <= minimumStartingElement) {
						indexOfMinimumStartingElementIndex = i;
					}
				}
				segmentLength++;
				sum += num;
				y = i;
				i++;
				firstTime = false;
			}
			firstTime = true;
			// case 1: sum(sub A) > sum(sub B).
			System.out.printf("Sum = %d\n",sum);
			System.out.printf("sizeOfMaxNonNegativeSubArray = %d\n",sizeOfMaxNonNegativeSubArray);
			if (sum > sizeOfMaxNonNegativeSubArray) {
				sizeOfMaxNonNegativeSubArray = sum;
				x = y - segmentLength + 1;
				System.out.printf("segmentLength = %d\n",segmentLength);
				maxSegmentLength = segmentLength;
			}
			// case 2: If there is a tie, then compare with segment's length and
			// return segment which has maximum length
			if (sum == sizeOfMaxNonNegativeSubArray && segmentLength > maxSegmentLength) {
				sizeOfMaxNonNegativeSubArray = sum;
				x = y - segmentLength + 1;
			}
			// case 3: If there is still a tie, then return the segment with
			// minimum starting index
			if (sum == sizeOfMaxNonNegativeSubArray && segmentLength == maxSegmentLength) {
				x = indexOfMinimumStartingElementIndex;
			}
			maxSegmentLength = maxSegmentLength > segmentLength ? maxSegmentLength : segmentLength;
			minimumStartingElement = minimumStartingElement < minStartingElement ? minimumStartingElement
					: minStartingElement;

		}
		for (int j = x; j < (x + maxSegmentLength); j++) {
			System.out.printf("x = %d\n",x);
			System.out.printf("maxSegmentLength = %d\n",maxSegmentLength);
			result.add(list.get(j));
		}
		return result;
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
