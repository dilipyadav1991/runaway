package GenericDataStructure.Queue;

public interface Queue<E> {
	public void add(E data);// Enqueue

	public void remove();// dequeue

	public E peek();
}
