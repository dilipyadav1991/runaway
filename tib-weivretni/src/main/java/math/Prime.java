//https://www.interviewbit.com/problems/verify-prime/

package Math;

// All interger numbers are of form 6k + i for i = -1, 0 , 1 , 2 , 3 or 4
public class Prime {
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		// integers of form 6k + 0, 6k + 2, 6k + 4 are divisible by 2
		// integers of form 6k + 3 are divisible by 3
		// so is below check
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		// remaining check is for integer form 6k - 1 and 6k + 1
		// so lets start from 5 which is 6k - 1 = 6 * 1 -1 = 5
		for (int i = 5; i * i <= n; i += 6) {
			if ((n % i == 0) || (n % (i + 2) == 0)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(84923));
	}
}
