class Parameter {

	public static void main(String[] args) {
		
		var generic = new Generic<String, Boolean>();
		generic.value = true;

		System.out.println(generic.getValue());
	}
}

class Generic<k, v> {
	public k key;
	public v value;

	public v getValue() {
		return value;
	}
}

class Generic1<k, v> extends Generic<k, v> {

}

class Generic2 extends Generic<String, Integer>{

}