import java.util.EmptyStackException;

public class Stack<E> {

	private E[] elements;
	private final int size;
	private int top;

	public void push(E pushValue) throws FullStackException {
		if (top == size - 1)
			throw new FullStackException();
		elements[++top] = pushValue;
	}

	public E pop() {
		if (top == -1)
			throw new EmptyStackException();
		return elements[top--];
	}

	public Stack() {
		size = 10;
		top = -1;
		elements = (E[]) new Object[size];
	}

}
