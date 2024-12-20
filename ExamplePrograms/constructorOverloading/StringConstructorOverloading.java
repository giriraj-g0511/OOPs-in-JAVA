package constructorOverloading;

import java.nio.charset.StandardCharsets;

public class StringConstructorOverloading {
	public static void main(String[] args) {
		// Example 1: Using constructor with char[]
		char[] charArray = { 'J', 'a', 'v', 'a' };
		String str1 = new String(charArray); // Using the constructor with char[]
		System.out.println("String created from char array: " + str1);

		// Example 2: Using constructor with byte[] and charset
		byte[] bytes = { 72, 101, 108, 108, 111 }; // ASCII values for "Hello"
		String str2 = new String(bytes, StandardCharsets.UTF_8); // Using the constructor with byte[] and charset
		System.out.println("String created from byte array: " + str2);

		// Example 3: Using constructor with String
		String originalString = "Hello, World!";
		String str3 = new String(originalString); // Using the constructor with String
		System.out.println("String created from another string: " + str3);
	}
}
