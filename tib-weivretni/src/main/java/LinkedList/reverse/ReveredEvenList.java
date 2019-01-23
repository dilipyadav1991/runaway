package LinkedList.reverse;

import LinkedList.Node;

public class ReveredEvenList {
	Node head;
	 
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
	
	//reverse even positioned list and add at the end of the list
	public void reverseList(){
		
	}
	
	public static void main(String[] args) {
		ReveredEvenList linkedlist = new ReveredEvenList();
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
