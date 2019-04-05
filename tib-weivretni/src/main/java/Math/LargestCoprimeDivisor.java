//https://www.interviewbit.com/problems/largest-coprime-divisor/

package Math;

public class LargestCoprimeDivisor {
	public static int gcd(int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		if (x == y) {
			return x;
		}
		if (x > y) {
			return gcd(x - y, y);
		}
		return gcd(x, y - x);
	}

	private static int findLargestCoPrime(int i, int j) {
		while (gcd(i, j) != 1) {
			i = i / gcd(i, j);
		}
		return i;
	}

	public static void main(String[] args) {
		System.out.println(findLargestCoPrime(15, 3));
	}
}
