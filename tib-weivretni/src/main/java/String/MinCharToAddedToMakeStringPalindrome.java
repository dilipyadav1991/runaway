package String;

public class MinCharToAddedToMakeStringPalindrome {
	public static void main(String[] args) {
		String str = "AACECAAAA";
		int count = findMinCharToAdd(str);
		System.out.println(count);
	}

	private static int findMinCharToAdd(String string) {
		StringBuilder str = new StringBuilder(string);
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			boolean isPalindrome = isPalindrome(str);
			if (isPalindrome) {
				return count;
			} else {
				count++;
				// remove from last
				str.deleteCharAt(i);
			}
		}
		return count;
	}

	private static boolean isPalindrome(StringBuilder str) {
		int i, j;
		String msg = str.toString();
		int len = str.length();
		for (i = 0, j = len - 1; i <= j; i++, j--) {
			if (msg.charAt(i) != msg.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
