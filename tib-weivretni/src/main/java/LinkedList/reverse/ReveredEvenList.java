package LinkedList.reverse;

import LinkedList.Node;

public class ReveredEvenList {
	Node head;
	Node evenHeadRef;

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

	// reverse even positioned list and add at the end of the list
	public void reverseList() {
		// base case
		if (head.next == null || head.next.next == null) {
			return;
		}
		Node odd = head;
		Node even = odd.next;
		evenHeadRef = even;
		while (true) {
			odd.next = even.next;
			odd = even.next;
			even.next = odd.next;
			even = odd.next;
			if (even == null || even.next == null) {
				break;
			}
		}
		odd.next = evenHeadRef;
		reverse(evenHeadRef);
		odd.next = evenHeadRef;
	}

	public void reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = current;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		evenHeadRef = prev;
	}

	public static void main(String[] args) {
		ReveredEvenList linkedlist = new ReveredEvenList();
		linkedlist.head = new Node(1);
		linkedlist.head.next = new Node(2);
		linkedlist.head.next.next = new Node(3);
		linkedlist.head.next.next.next = new Node(4);
		linkedlist.head.next.next.next.next = new Node(5);
		linkedlist.head.next.next.next.next.next = new Node(6);
		// print initial list
		linkedlist.printList();
		// reverse
		linkedlist.reverseList();

		System.out.println();

		// reprint list
		linkedlist.printList();
	}
}
