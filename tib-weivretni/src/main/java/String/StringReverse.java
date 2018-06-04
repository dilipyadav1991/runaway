package String;

public class StringReverse {
	static int i = 0;

	public static void printReverseString(String str) {
		if (str == null || str.length() < 1) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			printReverseString(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args) {
		printReverseString("String");
	}
}
