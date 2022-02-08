import java.util.Scanner;

class SingletonWithEnum {

	public static void main(String[] args) {
		UserInput ui = UserInput.INSTANCE;

		int i = ui.getValue();

		System.out.println("your number is " + i);

		callAgain();
	}

	static void callAgain () {

		UserInput ui2 = UserInput.INSTANCE;
	}
}

enum UserInput {
	INSTANCE;

	private Scanner sc;

	private UserInput () {
		sc = new Scanner(System.in);
	}

	public int getValue() {
		return sc.nextInt();
	}
}