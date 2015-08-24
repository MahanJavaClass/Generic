public class Queue<E> {
	private E[] elements;
	private final int size;
	private int front;
	private int rear;

	public void push(E pushValue) throws fullQueueException {
		if (rear == size)
			throw new fullQueueException();

		elements[rear++] = pushValue;
	}

	public E pop() throws EmptyQueueException {
		if (front >= rear)
			throw new EmptyQueueException();
		return elements[front++];
	}

	public Queue() {
		size = 10;
		front = 0;
		rear = 0;
		elements = (E[]) new Object[size];
	}

}
