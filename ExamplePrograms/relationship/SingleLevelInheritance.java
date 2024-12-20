package relationship;

class Parent{
	public void parentDisplay() {
		System.out.println("From Parent Display");
	}
}

class Child extends Parent{
	public void childDisplay() {
		System.out.println("From child Display");
	}
}


public class SingleLevelInheritance {
	
	public static void main(String[] args) {
		Child c= new Child();
		c.childDisplay();
		c.parentDisplay();
	}
	
}
