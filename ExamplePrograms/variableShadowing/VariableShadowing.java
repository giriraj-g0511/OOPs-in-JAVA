package variableShadowing;

/*
 * 
 * When super-class and sub-class have static and non static variable of same name and then it is known as variable shadowing
 * 
 * it comes under compile time polymorphism
 * 
 * */



class Parent {
	private int value = 10; // Non-static variable in the parent class
	static int count = 5; // Static variable in the parent class

	public void displayValues(int value) {
		System.out.println("Local variable value: " + value); // Local variable shadows the instance variable
		System.out.println("Instance variable value (Parent): " + this.value); // Accessing instance variable using
																				// 'this'
	}

	public void showCount(int count) {
		System.out.println("Local variable count: " + count); // Local variable shadows the static variable
		System.out.println("Static variable count (Parent): " + Parent.count); // Accessing static variable using class
																				// name
	}
}

class Child extends Parent {
	private int value = 20; // Shadowing the non-static variable from the parent
	static int count = 10; // Shadowing the static variable from the parent

	@Override
	public void displayValues(int value) {
		super.displayValues(value); // Call to parent method to see its behavior
		System.out.println("Local variable value (Child): " + value); // Local variable in the child method
		System.out.println("Instance variable value (Child): " + this.value); // Accessing the shadowed variable in
																				// child
	}

	@Override
	public void showCount(int count) {
		super.showCount(count); // Call to parent method to see its behavior
		System.out.println("Local variable count (Child): " + count); // Local variable in the child method
		System.out.println("Static variable count (Child): " + Child.count); // Accessing the shadowed static variable
																				// in child
	}
}

public class VariableShadowing {
	public static void main(String[] args) {
		Child child = new Child();

		System.out.println("----- Non-Static Variable Shadowing -----");
		child.displayValues(30); // Passing a local variable

		System.out.println("\n----- Static Variable Shadowing -----");
		child.showCount(15); // Passing a local variable
	}
}
