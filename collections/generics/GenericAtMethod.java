import javax.swing.text.PlainDocument;

class GenericAtMethod {

	public static void main(String[] args) {
		Pair<Integer, Integer> pair = GenericFactory.generatePair(12, 19);
		Pair pair2 = new Pair<>("zuki", 21);
		pair.get();
		pair2.get();
	}
}

class GenericFactory {

        //i want to ask this method // why we need to add more generic(<K, V>) infront of Pair<K, V>
	public static <K, V> Pair<K, V> generatePair (K key, V value) {
		return new Pair(key, value);
	}
}

class Pair<K, V> {
	private K key;
	private V value;
	
	Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void get() {
		System.out.println("key: " + key + " value: " + value);
	}
}
