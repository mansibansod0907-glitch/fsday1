package Company;

public class QueString8 {

	public static void main(String[] args) {
		String S1 = "Md";
		String S2 = "Mansi";
		String S3 ="Md"+"Mansi";
		String S4 = "Md Mansi";
		
		
		if(S3==S4) { 
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		if(S3.equals(S4)){
			System.out.println("Values are equal");
		}
		else {
			System.out.println("Values are not equal");
		}

	}

}
