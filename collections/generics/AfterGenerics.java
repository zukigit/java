import java.util.Arrays;

class AfterGenerics {

	public static void main(String[] args) {
		Container c = new Container<String>();
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