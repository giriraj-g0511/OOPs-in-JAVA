package constructorOverloading;

//Real World example
/*
* 
* The String class in Java provides several constructors with different parameter lists:
* Constructor 1: String(char[] value) - Creates a new String object from a character array.
* Constructor 2: String(byte[] bytes) - Creates a new String object by decoding the specified array of bytes using the platform's default charset.
* Constructor 3: String(String original) - Creates a new String object that represents the same sequence of characters as the specified string.
*
*Check for StringConsrutorOverloading program
*
**/


public class BottleDriver {
	public static void main(String[] args) {
		
		
		// It will use Constructor 1
		Bottle bottle1 = new Bottle("HydroFlask", "Matte Black", 0.5, 0.75, 25.0, "Screw-on", "Stainless Steel",
				"316 Stainless Steel", 29.99);
		System.out.println(bottle1); // Print toString()

		// It will use Constructor 2
		Bottle bottle2 = new Bottle("Nalgene", "Clear", 0.75);
		System.out.println(bottle2); // Print toString()

		// It will use Constructor 3
		Bottle bottle3 = new Bottle("CamelBak", "Matte Blue", 0.6);
		System.out.println(bottle3); // Print toString()

		// It will use Constructor 4
		Bottle bottle4 = new Bottle("S'well", 39.99);
		System.out.println(bottle4); // Print toString()
		
		//Above all are parameterized constructors
		
		
		// It will use Constructor 5(No Argument Constructor)
		Bottle bottle5 = new Bottle();
		System.out.println(bottle5); // Print toString()

	}

}
