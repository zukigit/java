class CheckDemo {

	public static void main(String[] args) {
		invokeCount(0);
	}

	static void invokeCount(int count) {

		try {// u must handle it because makeCount() method throws an Exception 
			makeCount(count);
		} catch(Exception e) {
			System.out.println("this count must not be zero");
		}
		
	}

	static void makeCount(int count) throws Exception {//if u use throws u dont need to handle in this method it must be hundle in another method that call makeCount() method

		if (count <= 0) {
			throw new Exception();
		}

		System.out.println("count is " +count);
	}
}