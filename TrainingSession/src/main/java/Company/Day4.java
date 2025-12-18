package Company;

public class Day4 {
	public static void main(String[] args) {
		boolean is_Married = false;
		if(is_Married == true) {
			System.out.println("Student is Married");
		}
		else {
			System.out.println("Student is not Married");
		}
		
		//Type Casting
		
	 byte a = 10;
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 10;
		double d = c;
		System.out.println(c);
		System.out.println(d);
		
		
		double e = 25.17;
		int f; 
		f = (int) e;
		System.out.println(e);
		System.out.println(f);
		
		
		float g = (float) 10.5;
		System.out.println(g);
		
		long h = 10;
		long i = 2147483649L;
		System.out.println(h);
		System.out.println(i);
		
		double r = 10 + 10.5 + 10.5f;
		System.out.println(r);
		
		int j = 5;
		int k = 2;
		double m = j/k;
		System.out.println(m); //2.0
		
	}

}
