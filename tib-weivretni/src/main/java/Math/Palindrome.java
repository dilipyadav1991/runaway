package Math;

//Example 12321
public class Palindrome {
	public static int isPalindrome(int A) {
		// Negative number is not palindrome
		if (A < 0)
			return 0;
		int divisor = 1;
		// calculate divisor
		while (A / divisor >= 10) {
			divisor *= 10;
		}

		while (A > 0) {
			// get leading digit 1
			int leadingNum = A / divisor;
			// get trailing digit 1
			int trailingNum = A % 10;
			if (leadingNum != trailingNum)
				return 0;
			// reduce this to 232.
			A = (A % divisor) / 10;
			divisor /= 100;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
	}
}
