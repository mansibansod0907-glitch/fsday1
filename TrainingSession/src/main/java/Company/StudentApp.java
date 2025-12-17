package Company;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student S1 = new Student();
		S1.name = " Mansi ";
		S1.age = 22;
		S1.CollageId = 220100571;
		
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.CollageId);
		S1.Study();
		new Student().Study();
		
		
		
	}

}
