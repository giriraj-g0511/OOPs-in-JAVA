package methodOverloading;

//Real World Example
/*
 * in jdbc we have 2 different methods for creating connection for 2 different argument 
 * first getConnecion(URL) it will take url,user,password in the form of url.
 * second getConnection(URL,User,Password) it will take 3 different arguments as url,user and password.
 * */

public class AdditionDriver {
	
	public static void main(String[] args) {
		Addition addition=new Addition();
		
		// same add method for int variables but it takes different no of arguments
		System.out.println(addition.add(10,20));
		System.out.println(addition.add(10,20,55));
		
		// same add method for double variables but it takes different arguments
		System.out.println(addition.add(9.8,7.9));
		System.out.println(addition.add(6.7,7.9,4.2));
		
	}
}
