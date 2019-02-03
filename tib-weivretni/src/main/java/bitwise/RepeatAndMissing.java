package bitwise;

public class RepeatAndMissing {
	public static void main(String[] args) {
		int array[] = new int[] { 3, 1, 2, 5, 3 };
		findRepeatedAndMissingOne(array, array.length);
	}

	private static void findRepeatedAndMissingOne(int[] array, int length) {
		int repeatedNumer;
		int missingNumber;
		int sum = 0;
		int sumActual = 0;
		int squareSum = 0;
		int actualSquareSum = 0;
		for (int i = 0; i < length; i++) {
			sumActual += array[i];
			actualSquareSum += array[i] * array[i];
		}
		sum = length * (length + 1) / 2;
		squareSum = length * (length + 1) * (2 * length + 1) / 6;
		int diff = sum - sumActual;
		int sumi = (actualSquareSum - squareSum)/ diff;
		repeatedNumer = (diff + sumi)/2;
		missingNumber = (sumi - diff)/2;
		System.out.println("The repeated number is: " + Math.abs(repeatedNumer));
		System.out.println("The missing number is : " + Math.abs(missingNumber));
	}
}
