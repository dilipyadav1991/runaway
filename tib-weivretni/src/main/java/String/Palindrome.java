package String;

/*
 * Modified problem to string array of sentences
 */
public class Palindrome {
	private static String[] sentences = { "race a car", "A man, a plan, a canal: Panama", "1b2"};

	public void isPalindrome() {
		System.out.println("The palindrome strings are:");
		for (int i = 0; i < sentences.length; i++) {
			boolean isPalindrome = true;
			int leftmostIndex = 0;
			int rightmostIndex = sentences[i].length() - 1;
			String sentence = sentences[i].toLowerCase();
			while (leftmostIndex <= rightmostIndex) {
				char leftmostCharacter = sentence.charAt(leftmostIndex);
				char rightmostCharacter = sentence.charAt(rightmostIndex);
				if (!((leftmostCharacter >= 'a' && leftmostCharacter <= 'z')
						|| (leftmostCharacter >= '0' && leftmostCharacter <= '9'))) {
					leftmostIndex++;
				}else if(!((rightmostCharacter >= 'a' && rightmostCharacter <= 'z')
						|| (rightmostCharacter >= '0' && rightmostCharacter <= '9'))){
					rightmostIndex--;
				}else if(leftmostCharacter == rightmostCharacter){
					leftmostIndex++;
					rightmostIndex--;
				}else{
					System.out.println("\"" + sentences[i] + "\"" + " is not a palindrome");
					isPalindrome = false;
					break;
				}
			}
			if(isPalindrome){
				System.out.println("\"" + sentences[i] + "\"" + " is a palindrome");
			}
		}
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.isPalindrome();
	}
}
