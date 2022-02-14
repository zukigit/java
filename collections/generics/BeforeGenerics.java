import java.util.Arrays;

class BeforeGenerics {
	public static void main(String[] args) {
		
		var container_obj = new Container();

		container_obj.add("zuki");
		container_obj.add(17);
		System.out.println(container_obj.getSize());
	}
}

class Container {

	private Object[] name = {}; 

	public Object getName(int index) {
		return name[index];
	}

	public Object[] getNameArray() {
		return Arrays.copyOf(name, name.length);
	}

	public int getSize() {
		return name.length;
	}

	public void add(Object name_input) {
		name = Arrays.copyOf(name, name.length+1);
		name[name.length-1] = name_input;
	}

}