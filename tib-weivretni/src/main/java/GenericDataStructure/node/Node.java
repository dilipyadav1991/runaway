package GenericDataStructure.node;

public interface Node<T> {
	public T getData();

	public void setData(T data);

	public Node<T> getNext();

	public void setNext(Node<T> next);
}
