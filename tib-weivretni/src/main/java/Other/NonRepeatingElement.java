package Other;

public class NonRepeatingElement {
	public static int[] getTwoNonRepeatingElement(int[] A) {
		int result[] = new int[2];
		int xor = A[0];
		int size = A.length;
		for (int i = 1; i < size; i++) {
			xor ^= A[i];
		}
		// Get rightmost set bit
		int rightmostSetBit = xor & ~(xor - 1);
		int x = 0;
		int y = 0;
		for (int i = 0; i < size; i++) {
			if ((rightmostSetBit & A[i]) > 0) {
				x = x ^ A[i];
			} else {
				y = y ^ A[i];
			}
		}
		result[0] = x;
		result[1] = y;
		return result;
	}

	public static void main(String[] args) {
		int x[] = getTwoNonRepeatingElement(new int[] { 2, 3, 7, 9, 11, 2, 3, 11 });
		for(int i : x){
			System.out.println(i);
		}
	}
}
