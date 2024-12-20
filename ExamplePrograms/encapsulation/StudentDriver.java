package encapsulation;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student s2=new Student();
		s2.setName("John");
		s2.setRollNo(1);
		s2.setStandard(10);
		
		Student s1=new Student();
		s1.setName("Domnic");
		s1.setRollNo(10);
		s1.setStandard(11);

		System.out.println(s1.getName());
		System.out.println(s1.getRollNo());
		System.out.println(s1.getStandard());
		
		System.out.println(s2.getName());
		System.out.println(s2.getRollNo());
		System.out.println(s2.getStandard());
		
		
		
		
	}
	
}
