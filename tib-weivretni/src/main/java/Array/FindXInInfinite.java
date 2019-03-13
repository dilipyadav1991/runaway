package Array;

public class FindXInInfinite {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		findX(a, 7);
	}

	private static void findX(int a[], int x) {
		int low = 0;
		int high = 1;
		int value = a[0];
		while (value < x) {
			low = high;
			high = high * 2;
			value = a[high];
		}
		int index = binarySearch(a, low, high, x);
		System.out.println("The index of the value is: " + index);
	}

	private static int binarySearch(int[] a, int low, int high, int x) {
		if (high >= 1) {
			int mid = (low + high) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] < x) {
				return binarySearch(a, mid + 1, high, x);
			} else {
				return binarySearch(a, low, mid - 1, x);
			}
		}
		return -1;
	}
}
