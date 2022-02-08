class CustomException {

	public static void main(String[] args) {
		highLevel();	
	}

	static void highLevel() {
		try{
			middleLevel();
		} catch(MyException e) {
			e.getMessage();
		}
	}

	static void middleLevel() {
		try{
			lowLevel();
		} catch(Exception e) {
			throw new MyException("don't divide by zero");
		}
	}

	static void lowLevel() throws Exception{
		int i = 10 / 0 ;
		System.out.println("Hi I'm low level method");
	}
}

class MyException extends RuntimeException {

	MyException(String message) {
		super(message);
	}

	MyException(Throwable cause) {
		super(cause);
	}
}