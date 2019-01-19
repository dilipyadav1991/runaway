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
		System.out.println("Hello World");
		if(root == null)
			return;
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<Node> Q = new LinkedList<Node>();
		LinkedList<Integer> hd = new LinkedList<>();

		Q.add(root);
		hd.add(0);

		int minHd = 0;
		int maxHd = 0;

		while (!Q.isEmpty()) {
			Node node = Q.peek();
			Q.remove();
			Integer distance = hd.poll();

			if (map.containsKey(distance)) {
				map.get(distance).add(node.data);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(node.data);
				map.put(distance, list);
			}

			System.out.println("map: " + map);
			// To do: Track Min and Max Level
			minHd = Math.min(distance, minHd);
			maxHd = Math.max(distance, maxHd);

			// push children of node to the queue and its distance
			if (node.left != null) {
				Q.add(node.left);
				hd.add(distance - 1);
			}
			if (node.right != null) {
				Q.add(node.right);
				hd.add(distance + 1);
			}
		}
		
		System.out.println("minHd: " + minHd);
		System.out.println("maxHd: " + maxHd);
		for(int i = minHd; i <= maxHd; i++){
			if(map.containsKey(i)){
				result.add(map.get(i));
			}
		}
		System.out.println(result);
	}
}
