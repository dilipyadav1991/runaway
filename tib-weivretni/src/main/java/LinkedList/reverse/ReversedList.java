package LinkedList.reverse;

import LinkedList.Node;

public class ReversedList {

	Node head;

	public void reverseList() {
		Node current = head;
		Node prev = null;
		Node next = current;
		while (current != null) {
			next = next.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
			if (temp != null) {
				System.out.print("->");
			}
		}
	}

	public static void main(String[] args) {
		ReversedList linkedlist = new ReversedList();
		linkedlist.head = new Node(1);
		linkedlist.head.next = new Node(2);
		linkedlist.head.next.next = new Node(3);
		// print initial list
		linkedlist.printList();
		// reverse
		linkedlist.reverseList();

		System.out.println();
		
		// reprint list
		linkedlist.printList();
	}
}
