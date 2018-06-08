//https://www.interviewbit.com/problems/reverse-integer/

package Math;

public class ReverseInterger {
	public static void main(String[] args) {
		System.out.println(findReverseInteger(-1234));
	}

	private static int findReverseInteger(int number) {
		int reverseInt = 0;
		int previousReverseInt = 0;
		int remainder = 0;
		boolean isNegative = false;
		// check if number is negative
		if (number < 0) {
			isNegative = true;
			number = 0 - number;
		}
		// reverse digits
		while (number != 0) {
			remainder = number % 10;
			reverseInt = reverseInt * 10 + remainder;// This value will be
														// garbage if number is
														// large eg:1000000045
			// check for overflow\
			if ((reverseInt - remainder) / 10 != previousReverseInt) {
				throw new NumberFormatException("Number is huge");
			}
			previousReverseInt = reverseInt;
			number = number / 10;
		}
		if (isNegative) {
			return -reverseInt;
		}
		return reverseInt;
	}
}
