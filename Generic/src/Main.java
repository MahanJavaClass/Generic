import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		String[] str = { "ali", "hasan" };
		Integer[] intg = { 1, 2, 3 };
		Character[] chara = { 'a', 'b' };
		Main main = new Main();
		System.out.println(main.maximum(new Student("ali", 12), new Student(
				"zohre", 10), new Student("ali", 18)));
	
		Stack<Student> stack = new Stack<>();
		stack.push(new Student("ali", 15));
		stack.push(new Student("samira", 12));
		stack.pop();
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
