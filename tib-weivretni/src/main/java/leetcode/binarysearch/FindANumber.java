package leetcode.binarysearch;

public class FindANumber {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int num = 5;
		int y = findPos(a, 0, a.length-1, num);
		System.out.println(y);
	}

	private static int findPos(int[] a, int l, int r, int num) {
		int m = l + (r - l)/2;
		while(l < r) {
			if(a[m] == num) {
				return m;
			}else if(a[m] > num) {
				return findPos(a, l, m, num);
			}else {
				return findPos(a, m, r, num);
			}
		}
		return -1;
	}
}
