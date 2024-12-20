package objectCreationAndInitialization;

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
	
    
	//This contains Bottle details
	/*@Override
	public String toString() {
		return "This bottle by " + brand + " features a sleek " + color + " design, weighs " + weight
				+ " kg, offers a capacity of " + capacity + " liters, stands at a height of " + height
				+ " cm, comes with a " + capType + " cap made of " + capMaterial + ", is made from " + bottleMaterial
				+ ", and is priced at $" + price + ".";
	}*/

}
