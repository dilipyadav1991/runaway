//https://www.interviewbit.com/problems/trailing-zeros-in-factorial/

package Math;

public class TrailingZeros {
	public static int findTrailingZerosInFactorial(int n) {
		int remainder = 1;
		int answer = 0;
		int counter = 1;
		// base case
		if (n <= 0) {
			return 1;
		}
		while (remainder >= 1) {
			remainder = (int) (n / (Math.pow(5, counter)));
			answer = answer + remainder;
			counter++;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(findTrailingZerosInFactorial(4617));
		System.out.println(findTrailingZerosInFactorial(23));
		System.out.println(findTrailingZerosInFactorial(101));
	}
}
