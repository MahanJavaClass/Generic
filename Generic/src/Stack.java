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

	@Override
	public boolean equals(Object input) {
		Boolean result;
		Stack<E> stackInput = null;
		if (this == input)
			return true;
		if (input instanceof Stack<?>)
			stackInput = (Stack<E>) input;
		else
			return false;

		if (this.elements.length == stackInput.elements.length)
			result = true;
		else
			result = false;
		for (int i = 0; i < elements.length; i++) {
			if (!this.elements[i].equals(stackInput.elements[i])) {
				result = false;
			}
		}

		return result;
	}

	public Stack() {
		size = 10;
		top = -1;
		elements = (E[]) new Object[size];
	}

}
