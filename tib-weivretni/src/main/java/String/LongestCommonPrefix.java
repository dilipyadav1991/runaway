package String;

public class LongestCommonPrefix {
	private String[] strings = {"geeksforgeeks", "geeks", "geek", "geezer"}; 
	public void findCommonPrefix(){
		int stringArrayLength = strings.length;
		String prefix = strings[0];
		for(int i = 1; i < stringArrayLength; i++){
			prefix = prefixUtil(prefix, strings[i]);
		}
		System.out.println("LongestCommonPrefix = " + prefix);
	}
	private String prefixUtil(String str1, String str2) {
		String prefix = "";
		int strlen1 = str1.length();
		int strlen2 = str2.length();
		int i,j;
		for(i = 0, j = 0; i < strlen1 && j < strlen2; i++,j++){
			if(str1.charAt(i) != str2.charAt(j)){
				break;
			}
			prefix += str1.charAt(i);
		}
		return prefix;
	}
	public static void main(String[] args) {
		LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
		commonPrefix.findCommonPrefix();
	}
}
