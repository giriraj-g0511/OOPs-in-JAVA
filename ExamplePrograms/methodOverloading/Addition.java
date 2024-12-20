package methodOverloading;

/*
 * Same method name but either different formal argument number or thier datatypes
 * */

public class Addition {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	
}
