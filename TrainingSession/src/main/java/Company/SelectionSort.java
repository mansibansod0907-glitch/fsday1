package Company;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {40,50,30,10,20};for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("<-------------------------------------->");

		for(int i=0;i<a.length;i++) {
			int smallest = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[smallest] > a[j]) {
					smallest = j;
				}
			}
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

