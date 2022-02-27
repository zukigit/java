import java.util.*;

class QueueInterface {

	public static void main(String[] args) {
		
		var linkedList = new LinkedList<String>();
		Queue<String> queue = linkedList;
		List<String> list = linkedList;

		linkedList.add("Hello");
		queue.offer("world");
		list.add("java");

		System.out.println(queue);

		var value = queue.remove();
		System.out.println("Removed value is " + value);

		var element = queue.element();
		System.out.println("Next element is " + element);
	}
}