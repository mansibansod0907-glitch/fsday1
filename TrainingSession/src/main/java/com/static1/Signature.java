package com.static1;

public class Signature {

	final synchronized static public void main(String... args) {
		System.out.println("Signature");
		int a[] = {1,2,3,4};
		main(a);
		main();
		main('a');
	}

	
	public static void main(int [] args) {
		System.out.println("main accepting integer type array");
	}
	public static void main() {
		System.out.println("main accepting any argument");
	}
	public static void main(char a) {
		System.out.println("main is accepting character input");
	}
}
