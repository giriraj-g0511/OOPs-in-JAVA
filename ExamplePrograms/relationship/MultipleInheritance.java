package relationship;

interface Virat {
	default void career() {
		System.out.println("Virat's career: Cricket Player");
	}
}

interface Anushka {
	default void career() {
		System.out.println("Anushka's career: Actress");
	}
}

class Akay implements Virat, Anushka {

	public void career(String name) {
		System.out.println(name + "'s career: Software Engineer");
	}

	@Override
	public void career() {
		Virat.super.career();

		Anushka.super.career();
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Akay akay = new Akay();

		akay.career("Akay");

		akay.career();
	}
}
