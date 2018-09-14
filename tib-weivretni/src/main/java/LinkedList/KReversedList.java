package LinkedList;

public class KReversedList {
	static Node head1;

	public static Node reverseList(Node node, int k) {
		int i = 0;
		Node previous = null;
		Node next = null;
		Node current = node;
		while (i < k && current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			i++;
		}
		Node temp = previous;
		while (temp.next != null) {
			temp = temp.next;
		}
		if (next != null) {
			temp.next = next;
		}
		head1 = previous;
		return head1;
	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

	}

	public static void main(String[] args) {
		KReversedList.head1 = new Node(1);
		KReversedList.head1.next = new Node(2);
		KReversedList.head1.next.next = new Node(3);
		KReversedList.head1.next.next.next = new Node(4);
		KReversedList.head1.next.next.next.next = new Node(5);

		Node reversedList = reverseList(head1, 3);
		printList(reversedList);
	}

}
