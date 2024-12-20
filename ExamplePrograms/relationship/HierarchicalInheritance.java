package relationship;

class AA{
	public void AADisplay() {
		System.out.println("From AA class");
	}
}

class ABA extends AA{
	public void ABADisplay(){
		System.out.println("From ABA class");
	}
}

class ABB extends ABA{
	public void ABBDisplay() {
		System.out.println("From ABB class");
	}
}

class ABC extends AA{
	public void ABCDisplay() {
		System.out.println("From ABC class");
	}
}


public class HierarchicalInheritance {
	public static void main(String[] args) {
		ABC abc=new ABC();
		System.out.println("ABC object created");
		abc.ABCDisplay();
		abc.AADisplay();
		
		System.out.println("\n");
		
		ABB abb = new ABB();
		System.out.println("ABB object created");
		abb.ABBDisplay();
		abb.ABADisplay();
		abb.AADisplay();
	}
}
