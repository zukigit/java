import java.util.Scanner;

class Test1 {

	public static void main(String[] args) {
		handleZeroError();
	}

	static void handleZeroError() {
		try{
			checkUserInput();
		} catch (ZeroError e) {
			System.out.println(e.getMessage());
			handleZeroError();
		}
	}

	static void checkUserInput() throws ZeroError{
		UserInput inputObj = UserInput.INSTANCE;
		Scanner sc = inputObj.getInstance();

		int userInput = sc.nextInt();
		if (userInput == 0) {
			throw new ZeroError("Input mut not be zero");
		} else {
			System.out.println("your number is " + userInput);
		}
	}
}

class ZeroError extends RuntimeException {

	public ZeroError(String name) {
		super(name);
	}
}

enum UserInput {

	INSTANCE;

	private Scanner sc;

	private UserInput() {
		sc = new Scanner(System.in);
	}

	public Scanner getInstance() {
		return sc;
	}
}
