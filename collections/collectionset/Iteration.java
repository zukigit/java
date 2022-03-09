import java.util.*;
import java.util.function.Consumer;

class Iteration {

	public static void internal(Queue<String> queue) {
		queue.forEach(new Consumer<String>() {
			public void accept(String data) {
				System.out.println(data);
			}
		});
	}

	public static void external(Queue<String> queue) {
		for(String data : queue) {
			System.out.println(data);
		}
	}

	public static void dequeLoop(Queue<String> queue, Boolean start_from_head) {
		Deque<String> deque = new ArrayDeque<String>(queue);

		if(start_from_head) {
			while(deque != null) {
				System.out.println(deque.pollFirst());
			}
		} else {
			while(!deque.isEmpty()) {
				System.out.println(deque.pollLast());
			}
		}
	} 
}