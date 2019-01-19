package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VerticalOrderTraversal {
	Node root;

	public static void main(String[] args) {
		VerticalOrderTraversal tree = new VerticalOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.printVerticalOrder(tree.root);
	}

	private void printVerticalOrder(Node root) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		Queue<Node> Q = new LinkedList<Node>();
		LinkedList<Integer> hd = new LinkedList<>();

		Q.add(root);
		hd.add(0);

		int minHd = 0;
		int maxHd = 0;

		while (!Q.isEmpty()) {
			Node node = Q.peek();
			Integer distance = hd.poll();

			if (map.containsKey(distance)) {
				map.get(distance).add(node.data);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(node.data);
				map.put(distance, list);
			}

			// To do: Track Min and Max Level
		}

	}
}
