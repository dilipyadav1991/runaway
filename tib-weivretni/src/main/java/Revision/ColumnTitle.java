package Revision;

public class ColumnTitle {
	private int columnNumber = 29;

	public void findColumnTitle() {
		int number = columnNumber;
		StringBuilder builder = new StringBuilder();
		while (number > 0) {
			int remainder = number % 26;
			if (remainder == 0) {
				builder.append("Z");
				number = (number / 26) - 1;
			} else {
				builder.append((char) ((remainder - 1) + 'A'));
				number = (number / 26);
			}
		}
		System.out.println(builder.reverse());
	}

	public static void main(String[] args) {
		ColumnTitle title = new ColumnTitle();
		title.findColumnTitle();
	}
}
