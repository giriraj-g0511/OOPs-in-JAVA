package methodShadowing;

/*
 * 
 * Static methods can be shadowed in subclasses. 
 * However, when called using a superclass reference, the static method of the superclass is invoked 
 * 	because static methods are resolved at compile time, not dynamically.  
 * 
 * */

class Animal {
	static void sound() {
		System.out.println("Some generic animal sound");
	}
}

class Dog extends Animal {
	static void sound() {
		System.out.println("Bark");
	}
}

public class MethodShadowing {
	public static void main(String[] args) {
		Animal myAnimal = new Dog(); // Reference type is Animal, actual object type is Dog
		myAnimal.sound(); // Outputs "Some generic animal sound"
	}

}

