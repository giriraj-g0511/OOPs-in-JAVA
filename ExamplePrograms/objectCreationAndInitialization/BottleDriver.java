package objectCreationAndInitialization;

public class BottleDriver {
	public static void main(String[] args) {
		Bottle b1 = new Bottle("HydroFlask", "Matte Black", 0.5, 0.75, 25.0, "Screw-on", "Stainless Steel",
				"316 Stainless Steel", 29.99);
		System.out.println(b1.getClass());
		System.out.println(b1.equals(null));
		System.out.println(b1.hashCode() + " is hashcode");
		System.out.println("at start \n" + b1.toString() + "\n at end");
	}
}
