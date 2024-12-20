package relationship;

class Pendrive {
	String speed;
	String brand;
	int size;
	double price;

	public Pendrive(String speed, String brand, int size, double price) {
		super();
		this.speed = speed;
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	public Pendrive() {
	}

	public String display() {
		return "Pendrive [speed=" + speed + ", brand=" + brand + ", size=" + size + ", price=" + price + "]";
	}
}

class Computer {
	String brand;
	String os;
	String processor;
	String ram;

	Pendrive pendrive;

	void inserPendrive() {
		pendrive = new Pendrive();
	}

	public Computer(String brand, String os, String processor, String ram, Pendrive pendrive) {
		super();
		this.brand = brand;
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.pendrive = pendrive;
	}

	public Computer() {
	}

	public String display() {
		return "Computer [brand=" + brand + ", os=" + os + ", processor=" + processor + ", ram=" + ram + ", pendrive="
				+ pendrive.display() + "]";
	}
}

public class LazyBinding {
	public static void main(String[] args) {
		Computer p = new Computer();
		// this will trow the null pointer exception because we try to access the
		// pendrive display method but we have not created object of pendrive
//		System.out.println(p.display());
		p.inserPendrive();
		System.out.println(p.display());

	}
}
