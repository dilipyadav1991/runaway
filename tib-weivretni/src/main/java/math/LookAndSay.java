package Math;

public class LookAndSay {
	public static void main(String[] args) {
		String str = "11123456577";
		int len = str.length();
		findNextTerm(str, len);
	}

	private static void findNextTerm(String str, int len) {
		String result = "";
		char ch = str.charAt(0);
		int times = 1;
		char nextChar;
		str = str + " ";
		for(int i = 1; i <= len ; i++){
			nextChar = str.charAt(i);
			if(ch == nextChar){
				times++;
			}else{
				result += times + "" + ch;
				times = 1;
				ch = nextChar;
			}
		}
		System.out.println(result);
	}
}
