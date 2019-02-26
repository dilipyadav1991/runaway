package GenericDataStructure.linkedlist;

public class LinkedList<T> {
	Node<T> head = null;

	public void add(T data) {
		Node<T> temp = head;
		if (head == null) {
			head = new Node<T>(data);
		} else {
			Node<T> node = new Node<T>(data);
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
	}

	public void remove(T data) {
		Node<T> temp = head;
		if (head.getData() == data) {
			head = head.getNext();
		}
		while (temp != null) {
			if (temp.getNext() != null && temp.getNext().getData() == data) {
				temp.setNext(temp.getNext().getNext());
			}
			temp = temp.getNext();
		}
	}

	public void print() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.getNext();
			System.out.print(" -> ");
		}
		System.out.println(" null ");
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.print();
		list.remove("3");
		list.print();

	}
}
