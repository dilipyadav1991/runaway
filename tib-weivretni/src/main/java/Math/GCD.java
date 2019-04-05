//https://www.interviewbit.com/problems/greatest-common-divisor/?ref=similar_problems

package Math;

public class GCD {
	public static int returnSmallest(int A, int B) {
		return A < B ? A : B;
	}

	public static int gcd(int A, int B) {
		int remainder = 0;
		while(B > 0){
			remainder = A % B;
			A = B;
			B = remainder;
		}
		return A;
	}

	public static void main(String[] args) {
		System.out.println(gcd(6, 9));
	}
}
