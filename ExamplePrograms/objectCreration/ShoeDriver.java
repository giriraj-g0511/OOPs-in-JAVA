package objectCreration;

public class ShoeDriver {
	static {
		System.out.println("From ShoeDriver static block1");
	}
	
	{
		System.out.println("From ShoeDriver non static block");
	}
	
	public static void main(String[] args) {
		Shoe s= new Shoe(7, "Paragon", "Plastic", "Slipper", 799);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		s.Shoee();
		Shoe.Shoee();
		System.out.println(s.companyName);
		System.out.println(s.material);
		System.out.println(s.price);
		System.out.println(s.size);
		System.out.println(s.type);
	}
	
}
