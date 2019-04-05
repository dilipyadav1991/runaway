package Math;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(101));
	}

	private static boolean isPalindrome(int i) {
		int divisor = 1;
		while (i / divisor >= 10) {
			divisor *= 10;
		}
		System.out.println("divisor : " + divisor);
		while (i > 0) {
			int ld = i / divisor;
			System.out.println("ld : " + ld);
			int td = i % 10;
			System.out.println("td : " + td);
			if (ld != td) {
				return false;
			}
			i = (i % divisor) / 10;
			System.out.println("i : " + i);
			divisor /= 100;
			System.out.println("divisor : " + divisor);
		}
		return true;
	}
}
