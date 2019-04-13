//https://www.urbanpro.com/class-ix-x-tuition/fastest-way-how-to-check-if-a-number-is-a

//http://burningmath.blogspot.com/2013/09/how-to-check-if-number-is-perfect-square.html

package leetcode.binarysearch;

public class ValidPerfectSquare {
	public static boolean isPerfectSquare(int num) {
		int l = 1;
		int r = num;
		while (l <= r) {
			long mid = l + (r - l) / 2;
			if (mid * mid == num) {
				return true;
			} else if (mid * mid > num) {
				r = (int) mid - 1;
			} else {
				l = (int) mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int a = 2147483647;
		System.out.println(isPerfectSquare(a));
	}
}
