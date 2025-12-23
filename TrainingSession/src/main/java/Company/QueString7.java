package Company;

public class QueString7 {

	public static void main(String[] args) {
		String S1 = "Md";
		String S2 = "Mansi";
		String S3 = S1.concat(S2);
		System.out.println(S3);
		String S4 = "Md Mansi";
		
		
		if(S3==S4) { 
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		if(S1.equals(S2)){
			System.out.println("Values are equal");
		}
		else {
			System.out.println("Values are not equal");
		}

	}

}
