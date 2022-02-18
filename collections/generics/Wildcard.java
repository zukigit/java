class Wildcard {

	public static void main(String[] args) {
		Pet<? extends Bird> pet; //can create obj with Bird and its subclasses

		pet = new Pet<Owl>(); //correct
		pet = new Pet<Bird>(); //correct
		//pet = new Pet<BullDog>(); // incorrect becoz wildcard extends to Bird

		Pet<? super BullDog> pet1; //can create with BullDog and its super classes
		pet1 = new Pet<Dog>();
		pet1 = new Pet<Animal>();
		// pet1 = new Pet<Bird>(); // incorrect Bird is not super class of BullDog
	}
}

class Animal {}

class Dog extends Animal {}

class BullDog extends Dog {}

class Bird extends Animal {}

class Owl extends Bird {}

class Pet<T> {}