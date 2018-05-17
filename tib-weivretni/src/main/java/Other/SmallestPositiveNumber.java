//https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
package Other;

public class SmallestPositiveNumber {
	public static void main(String[] args) {
		int arr[] = { 0, 10, 2, -10, -20 };
		int arr_size = arr.length;
		int missing = findMissing(arr, arr_size);
		System.out.println("The smallest positive missing number is " + missing);
	}

	private static int findMissing(int[] a, int arr_size) {
		int maxNum = a[0];
		int result = 0;
		for (int i = 1; i < arr_size; i++) {
			maxNum = maxNum > a[i] ? maxNum : a[i];
		}
		int hashTable[] = new int[maxNum + 1];
		for (int i = 1; i < maxNum; i++) {
			if (i < arr_size && a[i] > 0) {
				hashTable[a[i]] = 1;
			}
		}
		for (int i = 1; i < maxNum; i++) {
			if (hashTable[i] == 0) {
				result = i;
				break;
			}
		}
		return result;
	}
}
