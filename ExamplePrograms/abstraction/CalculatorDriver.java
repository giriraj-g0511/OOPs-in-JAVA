package abstraction;

public class CalculatorDriver {
	
	public static void main(String[] args) {
		CalculatorIntrface ci=new CalculatorClass();
		
//		ci.welcome();
		System.out.println("Addition :"+ci.add(1, 2));
		System.out.println("Multiplication :"+ci.multiplication(2, 8));
		System.out.println("Divivsion :"+ci.division(10, 2));
		System.out.println("Sustraction :"+ci.substraction(2, 2));
	}
	
}
