import java.util.*;
import java.util.function.Predicate;

class RemoveIf {
	public static void main(String[] args) {
		var set = new HashSet<Integer>();
		set.add(3);
		set.add(6);
		set.add(9);

		Predicate predicate = new Predicate<Integer>() {
			public  boolean test(Integer integer) {
				return integer % 2 == 0;
			}
		};

		set.removeIf(predicate);
		System.out.println(set);
	}
}