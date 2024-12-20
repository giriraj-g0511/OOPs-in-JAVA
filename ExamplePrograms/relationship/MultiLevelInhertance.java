package relationship;

class GrandParent{
	public void grandParentDisplay() {
		System.out.println("From GrandParent Display");
	}
}

class Parents extends GrandParent {
	public void parentDisplay() {
		System.out.println("From Parent Display");
	}
}

class Childs extends Parents{
	public void childDisplay() {
		System.out.println("From child Display");
	}
}


public class MultiLevelInhertance {

	public static void main(String[] args) {
		Childs c= new Childs();
		c.childDisplay();
		c.parentDisplay();
		c.grandParentDisplay();
	}
	
}
