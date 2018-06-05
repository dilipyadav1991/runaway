// Reverse an array without affecting special characters
// https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
package String;

public class StringReverseSpecialChars {
	public static void printStringReverseSpecialChars(char[] a) {
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			// check for char
			// in range 65 - 90
			// in range 97 - 122
			if (((a[i] >= 65 && a[i] <= 90) || (a[i] >= 95 && a[i] <= 122))
					&& ((a[j] >= 65 && a[j] <= 90) || (a[j] >= 95 && a[j] <= 122))) {
				// swap
				char temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				i++;
				j--;
			} else {
				if (!((a[i] >= 65 && a[i] <= 90) || (a[i] >= 95 && a[i] <= 122))) {
					i++;
				}
				if (!((a[j] >= 65 && a[j] <= 90) || (a[j] >= 95 && a[j] <= 122))) {
					j--;
				}
			}
		}
		for (char ch : a) {
			System.out.print(ch + " ");
		}
	}

	public static void main(String[] args) {
		char array[] = new char[] { 'a', 'b', '$', 'c' };
		printStringReverseSpecialChars(array);
	}
}
