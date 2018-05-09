package Array;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
	public static int sizeOfMaxNonNegativeSubArray(final ArrayList<Integer> list) {
		int sizeOfMaxNonNegativeSubArray = 0;
		int i = 0;
		int j = 0;
		int listSize = list.size();
		if (listSize == 0) {
			return 0;
		} else if (listSize == 1) {
			if (list.get(0) < 0) {
				return 0;
			} else {
				return 1;
			}
		}
		boolean firstTime = true;
		for (int index = 0; index < listSize; index++) {
			int num = list.get(index);
			if (num >= 0 && firstTime) {
				i = index;
				System.out.printf("i = %d\n", i);
				j = index;
				firstTime = false;
			} else if (num >= 0) {
				j = index;
				System.out.printf("j = %d\n", j);
			} else {
				firstTime = true;
			}
			sizeOfMaxNonNegativeSubArray = sizeOfMaxNonNegativeSubArray > (j - i + 1) ? sizeOfMaxNonNegativeSubArray
					: (j - i + 1);
		}
		return sizeOfMaxNonNegativeSubArray;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
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
