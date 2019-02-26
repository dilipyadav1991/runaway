package GenericDataStructure.stack;

import GenericDataStructure.linkedlist.LinkedList;
import GenericDataStructure.linkedlist.Node;

public class LinkedStack<T> implements Stack<T> {
	LinkedList<T> list;

	@Override
	public void push(T data) {
		if (list == null) {
			list = new LinkedList<T>();
		}
		list.add(data);
	}

	@Override
	public T pop() {
		if (list != null) {
			Node<T> poppedNode;
			Node<T> temp = list.getHead();
			while (temp != null) {
				if (temp.getNext() != null && temp.getNext().getNext() == null) {
					poppedNode = temp.getNext();
					temp.setNext(null);
					return poppedNode.getData();
				}else if(temp.getNext() == null) {
					list = null;
					return temp.getData();
				}
				temp = temp.getNext();
			}
		}
		return null;
	}

	@Override
	public T peek() {
		if (list != null) {
			Node<T> temp = list.getHead();
			while (temp != null) {
				if (temp.getNext() == null) {
					return temp.getData();
				}
				temp = temp.getNext();
			}
		}
		return null;
	}

	@Override
	public boolean empty() {
		if (list != null)
			return false;
		return true;
	}

	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
		stack.push("1");
		stack.push("2");
		System.out.println("Is stack empty? " + stack.empty());
		stack.push("3");
		stack.push("4");
		System.out.println("The top element is: " + stack.peek());
		System.out.println("The popped element is: " + stack.pop());
		System.out.println("The popped element is: " + stack.pop());
		System.out.println("The popped element is: " + stack.pop());
		System.out.println("The popped element is: " + stack.pop());
		System.out.println("The popped element is: " + stack.pop());
		
		
	}

}
