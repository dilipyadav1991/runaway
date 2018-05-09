package Array;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
	public static int sizeOfMaxNonNegativeSubArray(final ArrayList<Integer> list) {
		int sizeOfMaxNonNegativeSubArray = 0;
		int listSize = list.size();
		for (int i = 0; i < listSize; i++) {
			int currentCount = 0;
			while (i < listSize && list.get(i) >= 0) {
				currentCount++;
				i++;
			}
			sizeOfMaxNonNegativeSubArray = sizeOfMaxNonNegativeSubArray > currentCount ? sizeOfMaxNonNegativeSubArray
					: currentCount;
		}
		return sizeOfMaxNonNegativeSubArray;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(-1);
		list.add(-2);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(3);
		System.out.println(sizeOfMaxNonNegativeSubArray(list));
	}
}
