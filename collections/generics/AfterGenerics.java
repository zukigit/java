import java.util.Arrays;

class AfterGenerics {

	public static void main(String[] args) {
		Container c = new Container<String>();

		c.add("zuki");
		System.out.println(c.getSize());
		System.out.println(Arrays.toString(c.getAll()));

		Container c1 = new Container<Integer>();
		c1.add(1);
		System.out.println(Arrays.toString(c1.getAll()));
	}
}

class Container<T> {

	@SuppressWarnings("unchecked")
	private T[] array = (T[]) new Object[0];

	public void add(T input) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = input;
	}

	public int getSize() {
		return array.length;
	}

	public T[] getAll() {
		return Arrays.copyOf(array, array.length);
	}
}