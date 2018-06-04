package Array;

public class RepeatingMissingNumber {
	static int x = 0;
	static int y = 0;

	public static void main(String[] args) {
		int arr[] = { 2, 2 };

		int n = arr.length;
		getTwoElements(arr, n);
		System.out.println(" The missing element is  " + x + " and the repeating number is " + y);
	}

	private static void getTwoElements(int[] arr, int n) {
		int xor1 = arr[0];
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			xor1 = xor1 ^ arr[i];
		}
		for (int i = 1; i <= size; i++) {
			xor1 = xor1 ^ i;
		}
		// logger to find xor of two numbers
		//System.out.printf("xo1 = %d\n", xor1);

		// get rightmost set bit
		int setBit = xor1 & ~(xor1 - 1);
		// separate element whose bit is set
		for (int i = 0; i < size; i++) {
			if ((arr[i] & setBit) != 0) {
				x = x ^ arr[i];
			} else {
				y = y ^ arr[i];
			}
		}
		// separate element whose bit is unset
		for (int i = 1; i <= size; i++) {
			if ((i & setBit) != 0) {
				x = x ^ i;
			} else {
				y = y ^ i;
			}
		}
	}
}
