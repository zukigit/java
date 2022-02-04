class MakeError {

	public static void main(String[] args) {
		
		try {
			makeError(0);
		} catch (Exception e) {
			System.out.println("hi i'm exception in main");
		} catch(StackOverflowError e) {
			System.out.println("hi i'm stackoverflow error in main");
		} catch (Error e) {
			System.out.println("hi i'm error from main");
		}
	}

	static void makeError(int count) {
		System.out.println("Hi " + ++count);

		makeError(count);
	}
}