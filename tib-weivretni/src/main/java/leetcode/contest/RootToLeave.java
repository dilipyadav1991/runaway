package leetcode.contest;

import java.util.Arrays;

class Node {
	int val;
	Node left;
	Node right;

	Node(int val) {
		this.val = val;
	}
}

public class RootToLeave {
	static Node root;

	public static void findPath(Node node, int pathArray[], int length) {
		if (node == null) {
			return;
		}
		pathArray[length++] = node.val;
		if (node.left == null && node.right == null) {
			printpath(pathArray, length);
		} else {
			findPath(node.left, pathArray, length);
			findPath(node.right, pathArray, length);
		}
	}

	private static void printpath(int[] pathArray, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(pathArray[i]);
		}
		System.out.println();
	}

	public static void printPaths(Node node) {
		int path[] = new int[1000];
		findPath(root, path, 0);
	}

	public static void main(String[] args) {
		RootToLeave.root = new Node(1);
		RootToLeave.root.left = new Node(0);
		RootToLeave.root.right = new Node(1);
		RootToLeave.root.left.left = new Node(0);
		RootToLeave.root.left.right = new Node(1);
		RootToLeave.root.right.left = new Node(0);
		RootToLeave.root.right.right = new Node(1);
		printPaths(root);
	}

}
