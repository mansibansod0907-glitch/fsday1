package Company;

import java.util.Scanner;

public class QueArray8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,40,50};
		System.out.println("please enter index 1 to swap");
		int idx1=sc.nextInt();
		System.out.println("please enter index 2 to swap");
		int idx2=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("---------------------");
		int temp=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=temp;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

	}

}
