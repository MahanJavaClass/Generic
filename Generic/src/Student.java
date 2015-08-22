public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.getName();
	}

	@Override
	public int compareTo(Student input) {
		int compareResult;
		 if (input.getAge() > this.getAge())
			 compareResult = -1;
		else
			compareResult = 1;
	    if (this.equals(input))
	    	compareResult = 0;
	    return compareResult; 
	}

	@Override
	public boolean equals(Object input) {
		Student st = (Student) input;
		if (this.getName().equals(st.getName()))
			return true;
		else
			return false;
	}
}
