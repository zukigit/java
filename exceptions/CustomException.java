class CustomException {

	public static void main(String[] args) {
		highLevel();
		try {
			int i = 10 / 0;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void highLevel() {
		try {
			middleLevel(0);
		} catch (AppException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void middleLevel(int num) {
		if (num == 0) {
			throw new AppException("it can't be zero!");
		}
	}

	public static void lowLevel() {
		System.out.println("hi i'm exception!");
	}
}

class AppException extends RuntimeException {

	AppException(String name) {
		super(name);	
	}

	AppException(String name, Throwable cause) {
		super(name, cause);
	}

}

