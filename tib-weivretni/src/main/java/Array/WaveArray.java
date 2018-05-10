package Array;

import java.util.Arrays;

public class WaveArray {
	public static int[] waveArray(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i += 2) {
			int temp = array[i];
			array[i] = array[i + 1];
			array[i + 1] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 90, 49, 2, 1, 5, 23 };
		int[] a = waveArray(arr);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
