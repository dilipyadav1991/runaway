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
			while (temp != null && temp.next != null) {
				if (temp.next.data == data) {
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}
		}
	}

	private void length() {
		Node temp = head;
		int len = 0;
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		System.out.println("The length of linked list is : " + len);
	}

	public void reverseList() {
		Node current = head;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
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
		ll.length();
		System.out.println("Reversing list: \n");
		ll.reverseList();
		ll.printHead();
		ll.traverseList();
	}

}
