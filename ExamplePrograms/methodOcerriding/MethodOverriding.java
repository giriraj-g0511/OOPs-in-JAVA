package methodOcerriding;

/*
 * 
 *This occurs when a subclass provides a specific implementation of a method that is already defined in its
 *		 superclass. The JVM uses dynamic method dispatch to determine which method to invoke based on the 
 *		 actual object type at runtime.
 * 
 * Object Creation and Reference: When an object is created (`Animal myAnimal = new Dog();`), 
 * 		the reference (`myAnimal`) holds a reference to a `Dog` object. 
 * 		The actual method called depends on the object type behind the reference.
 * 
 * Dynamic Method Dispatch: This allows for polymorphism by selecting the appropriate method implementation based on the actual object 
 * 		type at runtime.
 * 
 * */



class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class MethodOverriding {
	 public static void main(String[] args) {
	        Animal myAnimal = new Dog(); // Reference type is Animal, actual object type is Dog
	        myAnimal.sound(); // Outputs "Bark"
	    }
}
