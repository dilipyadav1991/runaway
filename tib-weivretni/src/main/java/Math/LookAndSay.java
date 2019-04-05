package Math;

public class LookAndSay {
	public static void main(String[] args) {
		String number = "1";
		for(int i = 1; i < 10; i++){
			System.out.println(number);
			number = findNextTerm(number, number.length());
		}
	}

	private static String findNextTerm(String str, int len) {
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
		return result;
	}
}
