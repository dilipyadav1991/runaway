package Array;

public class AddOneToNumber {
	int a[] = { 0, 8, 9 };

	public void addOne() {
		int carry = 0;
		int len = a.length;
		a[len - 1] = a[len - 1] + 1;
		carry = a[len - 1] / 10;
		a[len - 1] = a[len - 1] % 10;
		for (int i = len - 2; i >= 0; i--) {
			if (carry == 0) {
				break;
			} else {
				a[i] = a[i] + 1;
				carry = a[i] / 10;
				a[i] = a[i] % 10;
			}
		}
		if (carry == 1) {
			int[] newInt = new int[len + 1];
			newInt[0] = 1;
			for (int i = 0; i < len; i++) {
				newInt[i + 1] = a[i];
			}
			for (int i = 0; i < newInt.length; i++) {
				System.out.print(newInt[i]);
			}
		} else {
			for (int i = 0; i < a.length; i++) {
				if(i == 0){
					//remove all leading zeros
					while(a[i] == 0){
						i++;
					}
				}
				System.out.print(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		AddOneToNumber addOne = new AddOneToNumber();
		addOne.addOne();
	}
}
