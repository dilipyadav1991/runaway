package Array;

public class DutchFlagProblem {
	static int array[] = { 1, 1, 2, 2, 0, 0, 0, 1 };

	public static void sort() {
		int low = 0;
		int current = 0;
		int high = array.length - 1;
		while (current <= high) {
			switch (array[current]) {
			case 0:
				int temp = array[low];
				array[low] = array[current];
				array[current] = temp;
				low++;
				current++;
				break;
			case 1:
				current++;
				break;
			case 2:
				int temp1 = array[high];
				array[high] = array[current];
				array[current] = temp1;
				high--;
				break;
			}
		}
	}

	public static void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		sort();
		printArray();
	}
}
