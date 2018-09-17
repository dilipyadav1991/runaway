package Revision;

public class ColumnNumber {
	private String columnTitle = "AZ"; //1 * 26^1 + 26 * 26^0
	public void findColumnNumber(){
		int number = 0;
		char[] ch = columnTitle.toCharArray();
		for(char c : ch){
			number *= 26;
			number += c - 'A' + 1;
		}
		System.out.println("The column number is : " + number);
	}
	public static void main(String[] args) {
		ColumnNumber number = new ColumnNumber();
		number.findColumnNumber();
	}
}
