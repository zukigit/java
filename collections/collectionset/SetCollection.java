import java.util.*;

class SetCollection {

	public static void main(String[] args) {

		var mutable = new HashSet<String>();
		mutable.add("hell java");

		System.out.println(mutable);

		var immutable = Set.copyOf(mutable);
		System.out.println(immutable);

		//immutable.add("something"); // this will show error
	}
}
