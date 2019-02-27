package GenericDataStructure.stack;

public class ArrayStack<T> implements Stack<T> {
	int top = -1;
	T[] stackArray;
	int[] h;

	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		stackArray = (T[]) new Object[size];
		h = new int[5];
	}

	@Override
	public void push(T data) {
		stackArray[++top] = data;
	}

	@Override
	public T pop() {
		return stackArray[--top];
	}

	@Override
	public T peek() {
		return stackArray[top];
	}

	@Override
	public boolean empty() {
		return top == -1 ? true : false;
	}
	
	public static void main(String[] args) {
		ArrayStack<String> stack = new ArrayStack<>(5);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		System.out.println("The top data is: " + stack.peek());
		System.out.println("The popped data is: " + stack.pop());
		System.out.println("Is stack empty? " + stack.empty());
	}

}
