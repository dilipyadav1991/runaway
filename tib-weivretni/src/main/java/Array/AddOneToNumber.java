package Array;

import java.util.ArrayList;

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
				if (i == 0) {
					// remove all leading zeros
					while (a[i] == 0) {
						i++;
					}
				}
				System.out.print(a[i]);
			}
		}
	}

	// Array list implementation
	private void plusOne(ArrayList<Integer> list) {
		
		int size = list.size();
		list.set(size - 1, list.get(size - 1) + 1);
		int carry = list.get(size - 1) / 10;
		list.set(size - 1, list.get(size - 1) % 10);

		for (int i = size - 2; i >= 0; i--) {
			list.set(i, list.get(i) + carry);
			carry = list.get(i) / 10;
			list.set(i, list.get(i) % 10);
			if (carry == 0) {
				break;
			}
		}
		if(carry == 1){
			list.add(0, 1);
		}
		int index = 0;
		if(list.get(index) == 0 && index == 0){
			list.remove(index);
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		AddOneToNumber addOne = new AddOneToNumber();
		// Array implementation
		//addOne.addOne();

		// List implementation
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(0);
		list.add(9);
		addOne.plusOne(list);

	}

}
