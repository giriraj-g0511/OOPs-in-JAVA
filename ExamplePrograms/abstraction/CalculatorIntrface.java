package abstraction;

public interface CalculatorIntrface {
	int add(int a,int b);
	int substraction(int a,int b);
	int multiplication(int a,int b);
	int division(int a, int b);
	
	default void welcome() {
		System.out.println("Welcome to calculator");
	}
}
