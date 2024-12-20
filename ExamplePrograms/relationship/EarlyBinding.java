package relationship;

class Battery{
	String brand;
	int capacity;
	
	public String display() {
		return "Battery [brand=" + brand + ", capacity=" + capacity + "]";
	}
	
	public Battery() {
	}

	public Battery(String brand, int capacity, double price) {
		this.brand = brand;
		this.capacity = capacity;
	}	
}


class Mobile{
	String brand;
	String model;
	int mainCamera;
	int selfiCamera;
	double price;
	String Processor;
	
	Battery battery = new Battery(Processor, mainCamera, price);

	public Mobile(String brand, String model, int mainCamera, int selfiCamera, double price, String processor,
			Battery battery) {
		this.brand = brand;
		this.model = model;
		this.mainCamera = mainCamera;
		this.selfiCamera = selfiCamera;
		this.price = price;
		Processor = processor;
		this.battery = battery;
	}

	public Mobile() {
	}

	public String display() {
		return "Mobile [brand=" + brand + ", model=" + model + ", mainCamera=" + mainCamera + ", selfiCamera="
				+ selfiCamera + ", price=" + price + ", Processor=" + Processor + ", battery=" + battery.display() + "]";
	}
}


public class EarlyBinding {
	
	public static void main(String[] args) {
	
		Mobile m1=new Mobile();
		System.out.println(m1.display());
		System.out.println("-----------------");
		System.out.println(m1.battery.display());
		
	}
	
	
}
