package Company;

public class StudentApp1 {

	public static void main(String[] args) {
		Student1 S1 = new Student1();
		System.out.println("Before Assigning the Values");
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.gender);
		
		System.out.println("After Assigning the Values");
		S1.name = "Mansi";
		System.out.println(S1.name);
		S1.age = "22";
		System.out.println(S1.age);
		S1.gender = "Feamle";
		System.out.println(S1.gender);
	}

}
