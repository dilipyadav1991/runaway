package leetcode.binarysearch;

public class FindPeakElement {
	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 2, 1 };
		int x = findPivot(a, 0, a.length - 1, a.length);
		System.out.println(x);
	}

	private static int findPivot(int[] a, int l, int r, int n) {
		int m = l + (r - l) / 2;
		if ((m == 0 || a[m] > a[m + 1]) && (m == n - 1 || a[m - 1] < a[m])) {// binary search condition fails here
			return m;
		} else if (m > 0 && a[m - 1] > a[m]) {
			return findPivot(a, l, m - 1, n);
		} else {
			return findPivot(a, m + 1, r, n);
		}
	}
}
