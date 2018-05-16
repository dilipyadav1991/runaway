package Other;

public class RepeatingElement {
	public static void main(String[] args) {
		RepeatingElement duplicate = new RepeatingElement();
		int arr[] = { 1, 6, 3, 1, 3, 6, 6 };
		int arr_size = arr.length;

		duplicate.printRepeating(arr, arr_size);
	}

	private void printRepeating(int[] arr, int arr_size) {
		for (int i = 0; i < arr_size; i++) {
			if (arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println(Math.abs(arr[i]) + " ");
			}
		}
	}
}
