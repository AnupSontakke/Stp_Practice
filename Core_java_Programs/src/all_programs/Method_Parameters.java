package all_programs;

public class Method_Parameters {
	
	int a;
	double b;
	static int c;
	static String X;
	
	public void arg1 (double d) {
		b=d;
		System.out.println("The value is b:-"+b);
	}
	
	public void arg2(int m,int r) {
		a=m;
		c=r;
		System.out.println("The value is a:-"+a);
		System.out.println("The value is c:-"+c);
	}
	
	public static void arg3(boolean aa,boolean ab, String ac) {
		
		boolean a=aa;
		boolean b=ab;
		String c=ac;
		
		System.out.println("The value is a:-"+a);
		System.out.println("The value is b:-"+b);
		System.out.println("The value is c:-"+c);
		
		
}
	
	public static void main(String[] args) {
		Method_Parameters anup=new Method_Parameters();
		anup.arg1(45.46);
		anup.arg2(166, 25);
		Method_Parameters.arg3(true, true, "anup" );
		
	}

}
