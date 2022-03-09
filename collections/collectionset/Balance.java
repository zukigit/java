import java.util.*;

class Balance {

	static boolean check(String str) {
		char[] array = str.toCharArray();
		Deque<Character> opens = new ArrayDeque<>();

		for (char c : array) {
			if(isOpen(c)) {
				opens.push(c);
				continue;
			}

			if(opens.isEmpty()) {
				return false;
			}

			char stack = opens.pop();
			if((stack == '}' && c != '}') || (stack == ')' && c != ')') || (stack == ']' && c != ']')) {
				return false;
			}
		}

		return opens.isEmpty();
 
	}

	static boolean isOpen(char c) {
		if(c == '{' || c == '(' || c == '[')
			return true;
		else return false;
	}
}