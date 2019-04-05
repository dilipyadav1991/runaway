//https://www.interviewbit.com/problems/excel-column-number/?ref=similar_problems

package Math;

public class ExcelColumnNumber {
	public static int getInt(char ch) {
		return (int) ch - 64;
	}

	public static int getExcelColumnNumber(String A) {
		int number = 0;
		int strlen = A.length();
		int power = 1;
		int base = 26;
		for (int index = strlen - 1; index >= 0; index--) {
			char character = A.charAt(index);
			number += getInt(character) * power;
			power = power * base;
		}
		return number;
	}
	
	public static void main(String[] args) {
		System.out.println(getExcelColumnNumber("A"));
		System.out.println(getExcelColumnNumber("AA"));
		System.out.println(getExcelColumnNumber("C"));
		System.out.println(getExcelColumnNumber("BB"));
	}
}
