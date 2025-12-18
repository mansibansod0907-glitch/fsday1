package Company;

public class SpecialChars {
	public static void main(String[] args) {
	int _x = 10;
	System.out.println(_x);

	int x____y = 20;
	System.out.println(x____y);
	int $xy = 30;
	System.out.println($xy);
	int y$$$$x$ = 40;
	System.out.println(y$$$$x$);
	
	//# is not allowed. $ and _ is allowed
	
	
	//int a = 10_; not allowed
	
	int b = 10_000;
	System.out.println(b);
	
	int c = 10_00_0;
	System.out.println(c);
	
	int d = 10__00_0;
	System.out.println(d);
	
	float e = 10_1.5f;
	System.out.println(e);
	
	//float f = 10_.561; not allowed
	//float g = _10f;
	
	
}
}