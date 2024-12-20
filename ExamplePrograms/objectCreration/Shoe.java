package objectCreration;

public class Shoe {
	int size;
	String companyName;
	String material;
	String type;
	double price;
	
	public Shoe(int size, String companyName, String material, String type, double price) {
		super();
		this.size = size;
		this.companyName = companyName;
		this.material = material;
		this.type = type;
		this.price = price;
	}
	
	public static void Shoee() {
		System.out.println("Shoe static method from Shoe class");
		return ;
	}
	
	{
		System.out.println("From to Shoe class non static block 1");
	}
	
	{
		System.out.println("From to Shoe class non static block 2");
	}
	
	static{
		System.out.println("From to Shoe class static block 1");
	}
	
	static {
		System.out.println("From to Shoe class static block 2");
	}
	
}
