//https://www.urbanpro.com/class-ix-x-tuition/fastest-way-how-to-check-if-a-number-is-a

//http://burningmath.blogspot.com/2013/09/how-to-check-if-number-is-perfect-square.html

package leetcode.binarysearch;

public class ValidPerfectSquare {
	public static boolean isPerfectSquare(int num) {
		int remainder = num % 10;
		// step 1: it ends in 2, 3,7 or 8
		if (remainder == 2 || remainder == 3 || remainder == 7 || remainder == 8)
			return false;
		// step 2: it terminates in an odd number of zeros
		int zerosCount = 0;
		int temp = num;
		while (temp > 0) {
			int r = temp % 10;
			if (r == 0) {
				zerosCount++;
			} else {
				break;
			}
			temp = temp / 10;
		}
		if (zerosCount % 2 != 0) {
			return false;
		}

		// Step 3: its last digit is 6 but its penultimate (tens) digit is even
		if (remainder == 6) {
			int t1 = num / 10;
			int r1 = t1 % 10;
			if (r1 % 2 == 0) {
				return false;
			}
		}

		// Step 4: its last digit is not 6 but its penultimate (tens) digit is odd
		if (remainder != 6) {
			int t1 = num / 10;
			int r1 = t1 % 10;
			if (r1 % 2 != 0) {
				return false;
			}
		}

		// Step 5: its last digit is 5 but its penultimate (tens) digit is other than 2
		if (remainder == 5) {
			int t1 = num / 10;
			int r1 = t1 % 10;
			if (r1 % 2 != 2) {
				return false;
			}
		}

		// Step 6: its last 2 digits are not divisible by 4 if it is even number
		if (num % 2 == 0) {
			int r1 = num % 100;
			if (r1 % 4 != 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		int a = 3;
		System.out.println(isPerfectSquare(a));
	}
}
