package leetcode.binarysearch;

public class FindPivot {
	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
		int x = findPivot(a, 0, a.length - 1);
		System.out.println(x);
	}

	private static int findPivot(int[] a, int l, int r) {
		int m = l + (r - l) / 2;
		while (l < r) {
			if (m - 1 > 0 && (a[m - 1] > a[m])) {// binary search condition fails here
				return m;
			} else if (a[m] > a[r]) {
				return findPivot(a, m, r);
			} else {
				return findPivot(a, l, m);
			}
		}
		return -1;
	}
}
