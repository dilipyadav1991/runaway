//https://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/

package String;

public class MaxAccuringCharacter {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		maxOccuringChar(str);
	}

	public static void maxOccuringChar(String str) {
		String result = "c";
		int strLen = str.length();
		int[] count = new int[256];
		char[] charArray = str.toCharArray();
		for (int i = 0; i < strLen; i++) {
			count[charArray[i]]++;
		}

		int max = -1;
		for (int i = 0; i < strLen; i++) {
			if (count[charArray[i]] > max) {
				max = count[charArray[i]];
				//result = charArray[i];
			}
		}
		//System.out.println("Max Occuring character: " + result);
	}
}
