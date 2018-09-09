package LinkedList;

public class LinkedList {
	Node head;

	public void traverseList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void printHead() {
		System.out.println("Head of the list is: " + head.data);
	}

	public void delete(int data) {
		Node temp = head;
		if (head.data == data) {
			head = head.next;
		} else {
			while (temp != null && temp.next!= null) {
				if (temp.next.data == data) {
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		ll.printHead();
		ll.delete(4);
		ll.traverseList();
	}
}
