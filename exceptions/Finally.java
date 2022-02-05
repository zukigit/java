class Finally {

	public static void main(String[] args) {
		
		try{
			callException();
		} catch (MyException e ) {
			System.out.println("catch my exception");
		} finally {
			System.out.println("end of try catch");
		}
	}

	static void callException() throws MyException{

		throw new MyException();
	}
}

class MyException extends Exception {

}