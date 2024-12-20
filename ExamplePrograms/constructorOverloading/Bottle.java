package constructorOverloading;

public class Bottle {

	String brand;
	String color;
	double weight;
	double capacity;
	double height;
	String capType;
	String capMaterial;
	String bottleMaterial;
	double price;
	
	//Constructor 1
	//Constructor Overloading
	public Bottle(String brand, String color, double weight, double capacity, double height, String capType,
			String capMaterial, String bottleMaterial, double price) {
		this.brand = brand;
		this.color = color;
		this.weight = weight;
		this.capacity = capacity;
		this.height = height;
		this.capType = capType;
		this.capMaterial = capMaterial;
		this.bottleMaterial = bottleMaterial;
		this.price = price;
	}

	//Constructor 2
	// Constructor Overloading
	public Bottle(String brand, String color, double capacity) {
		this.brand = brand;
		this.color = color;
		this.capacity = capacity;
	}
	
	//Constructor 3
	// Constructor Overloading
	public Bottle(String brand, double weight, String color) {
		this.brand = brand;
		this.color = color;
		this.weight = weight;
	}

	//Constructor 4
	// Constructor Overloading
	public Bottle(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	//Constructor 5 (No Argument Constructor)
	// Constructor Overloading
	public Bottle() {

	}

	@Override
	public String toString() {
		return "Bottle [brand=" + brand + ", color=" + color + ", weight=" + weight + ", capacity=" + capacity
				+ ", height=" + height + ", capType=" + capType + ", capMaterial=" + capMaterial + ", bottleMaterial="
				+ bottleMaterial + ", price=" + price + "]";
	}

	
	// This for details
	/*@Override
	public String toString() {
		return "This bottle by " + brand + " features a sleek " + color + " design, weighs " + weight
				+ " kg, offers a capacity of " + capacity + " liters, stands at a height of " + height
				+ " cm, comes with a " + capType + " cap made of " + capMaterial + ", is made from " + bottleMaterial
				+ ", and is priced at $" + price + ".";
	}*/

}
