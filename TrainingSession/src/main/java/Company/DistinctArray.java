package Company;

public class DistinctArray {

	public static void main(String[] args) {
		int a[] = {50, 10, 20,40, 30, 20, 10};
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		System.out.println("<------------------------------------>");
		
		for(int i=0; i<a.length; i++) {
			for(int j =0; j< a.length-1; j++) {
				if(a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j +1];
					a[j +1] = temp;
				}
			}
		}
		
		
		for (int i=0; i<a.length; i++) {
			if(i == 0 || a[i] != a[i -1]) {
			System.out.print(a[i] + " ");
		     }			
		 }
     }

  }
