package leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindIntersection {
	public static int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		// nums1
		for (int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], i);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (map.get(nums2[i]) != null) {
				list.add(nums2[i]);
			}
		}
		int result[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 1 };
		int b[] = { 2, 1 };
		int[] arr = intersection(a, b);
		System.out.println(Arrays.toString(arr));

	}
}
