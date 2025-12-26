package Company;

import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Department of Computer Technology";
		StringTokenizer st = new StringTokenizer(s," ");
		char c[] = s.toCharArray();
		
		for(int i=c.length-1; i>=0; i--) {
			System.out.print(c[i]);
		}
		
		
		
		

	}

}
