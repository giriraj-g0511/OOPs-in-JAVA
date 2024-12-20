package abstraction;

public class CalculatorClass implements CalculatorIntrface{
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	{
		CalculatorIntrface.super.welcome();
	}
	
}
