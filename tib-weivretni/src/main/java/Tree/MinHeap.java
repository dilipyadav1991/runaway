package Tree;

import java.util.Arrays;

public class MinHeap {
	private int capacity = 10;
	private int size = 0;
	int[] items = new int[capacity];

	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) < 0;
	}

	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < 0;
	}

	private boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	private int getLeftChild(int index) {
		return items[2 * index + 1];
	}

	private int getRightChild(int index) {
		return items[2 * index + 2];
	}

	private int getParent(int index) {
		return items[(index - 1) / 2];
	}

	private void swap(int i, int j) {
		int temp = items[i];
		items[i] = items[j];
		items[j] = temp;
	}

	private void ensureCapacity() {
		if (capacity == size) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity *= 2;
		}
	}

	public int peek() {
		if (size == 0)
			throw new IllegalStateException();
		return items[0];
	}

	public void add(int item) {
		ensureCapacity();
		items[size++] = item;
		heapifyUp();
	}

	public int poll() {
		if (size == 0)
			throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size - 1];
		size--;
		heapifyDown();
		return item;
	}

	public void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && getParent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	public void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			if (items[index] < items[smallerChildIndex])
				break;
			else
				swap(index, smallerChildIndex);
			index = smallerChildIndex;
		}
	}

	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap();
		minHeap.add(1000);
		minHeap.add(20);
		minHeap.add(17);
		minHeap.add(18);
		int x = minHeap.peek();
		System.out.println("The root element is: " + x);
		minHeap.poll();
		x = minHeap.peek();
		System.out.println("The root element is: " + x);
		int y = minHeap.poll();
		System.out.println("The removed element is: " + y);
	}
}
