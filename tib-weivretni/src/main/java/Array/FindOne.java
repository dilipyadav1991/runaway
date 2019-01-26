package Array;

public class FindOne {
	public static int findOneIndex(int[] array, int size) {
		int low = 0;
		int high = size - 1;
		if(array[low] == 1){
			return low;
		}
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == 1 && ((array[mid - 1] == 0) || mid == 0)) {
				return mid;
			} else if (array[mid] == 1) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {0, 0, 0 };
		int index = findOneIndex(a, a.length);
		System.out.println("The index is : " + index);
	}
}
