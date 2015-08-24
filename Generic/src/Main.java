public class Main {

	public static void main(String[] args) throws fullQueueException,
			EmptyQueueException, FullStackException {
		Main main = new Main();
		System.out.println(main.maximum(new Student("ali", 12), new Student(
				"zohre", 10), new Student("ali", 18)));

		Stack<Student> stack1 = new Stack<>();
		stack1.push(new Student("ali", 15));
		stack1.push(new Student("samira", 12));

		System.out.println(stack1.pop());

		Stack<Student> stack2 = new Stack<>();
		stack2.push(new Student("ali", 15));
		stack2.push(new Student("samira", 12));
		System.out.println(stack2.pop());

		boolean result = stack1.equals(new Stack<Double>());
		System.out.println(result);

		Queue<Student> queue = new Queue<>();
		queue.push(new Student("ali", 15));
		queue.push(new Student("samira", 12));
		System.out.println(queue.pop());

	}

	public <T> void print(T[] input) {
		for (T t : input) {
			System.out.println(t);
		}

	}

	public <T extends Comparable<T>> T maximum(T input1, T input2, T input3) {
		T max = input1;
		if (input2.compareTo(input1) > 0)
			max = input2;
		if (input3.compareTo(max) > 0)
			max = input3;
		return max;
	}
}
