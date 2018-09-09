package LinkedList;

public class YLinkedList {
	Node head1;
	Node head2;

	public void findIntersection() {
		int intersectionPoint = 0;
		int length1 = getSize(head1);
		int length2 = getSize(head2);

		if (length1 > length2) {
			int d = length1 - length2;
			intersectionPoint = getIntersectionPoint(d, head1, head2);
		} else {
			int d = length2 - length1;
			intersectionPoint = getIntersectionPoint(d, head2, head1);
		}
		System.out.println("The intersection point is: " + intersectionPoint);
	}

	public int getIntersectionPoint(int d, Node temp1, Node temp2) {
		int point = -1;
		for (int i = 0; i < d; i++) {
			temp1 = temp1.next;
		}
		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				return temp1.data;
			} else {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
		return point;
	}

	public int getSize(Node node) {
		int size = 0;
		Node temp = node;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public static void main(String[] args) {
		YLinkedList list = new YLinkedList();
		list.head1 = new Node(1);
		list.head1.next = new Node(2);
		list.head1.next.next = new Node(3);
		list.head1.next.next.next = new Node(4);

		list.head2 = new Node(6);
		list.head2.next = new Node(5);
		list.head2.next.next = new Node(4);

		list.findIntersection();
	}
}
