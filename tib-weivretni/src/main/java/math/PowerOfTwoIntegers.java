//Check if a number can be expressed as x^y (x raised to power y)

package Math;

public class PowerOfTwoIntegers {
	public static boolean isPower(int num) {
		for (int x = 2; x * x <= num; x++) {
			int power = x;
			while (power <= num && power > 0) {
				if (power == num) {
					return true;
				}
				power = power * x;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPower(64));
		System.out.println(isPower(10));
		System.out.println(isPower(4));
	}
}
