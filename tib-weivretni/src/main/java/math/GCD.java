//https://www.interviewbit.com/problems/greatest-common-divisor/?ref=similar_problems

package Math;

public class GCD {
	public static int returnSmallest(int A, int B) {
		return A < B ? A : B;
	}

	public static int gcd(int A, int B) {
		int gcd = 0;
		int smallerNum = returnSmallest(A, B);
		if(A == 0){
			return B;
		}
		if(B == 0){
			return A;
		}
		for(int i = 1; i <= smallerNum; i++){
			if(((A % i) == 0) && (B % i == 0)){
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(1,0));
	}
}
