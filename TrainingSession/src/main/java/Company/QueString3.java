package Company;

public class QueString3 {

	public static void main(String[] args) {
		String S1 = "Mansi";
		String S2 = "mansi";
		
		if(S1==S2) { //1000 = 1000
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
