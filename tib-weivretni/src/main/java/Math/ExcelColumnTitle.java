//https://www.interviewbit.com/problems/excel-column-title/

package Math;

public class ExcelColumnTitle {
	public static void main(String[] args) {
		System.out.println(findExcelColumntitle(25));
		System.out.println(findExcelColumntitle(705));
		System.out.println(findExcelColumntitle(52));
	}

	private static StringBuilder findExcelColumntitle(int number) {
		StringBuilder excelColumTitle = new StringBuilder();
		while (number > 0) {
			// Check remainder
			int remainder = number % 26;
			// if remainder is 0, char will be 'Z'
			if (remainder == 0) {
				excelColumTitle.append('Z');
				number = number / 26 - 1;
			} else {
				excelColumTitle.append((char) (remainder - 1 + 'A'));
				number = number / 26;
			}
		}
		return excelColumTitle.reverse();
	}
}
