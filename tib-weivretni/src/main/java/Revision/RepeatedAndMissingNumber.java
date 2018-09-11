package Revision;

public class RepeatedAndMissingNumber {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 3, 4 };
		findMissingAndRepeatedNumber(num);
	}

	private static void findMissingAndRepeatedNumber(int[] num) {
		System.out.println("The repeated number is : ");
		for (int i = 0; i < num.length; i++) {
			if (num[Math.abs(num[i]) - 1] < 0) {
				System.out.println(Math.abs(num[i]));
			} else {
				num[Math.abs(num[i]) - 1] = -num[Math.abs(num[i]) - 1];
			}
		}
		System.out.println("The missing number is : ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
