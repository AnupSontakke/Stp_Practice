package all_programs;

public class Logical_operators {
	public static void main(String[] args) {
	
		
		logical_ANd();
		
		System.out.println("                                ");
		
		Logical_OR();
		
	}
		
		     // ***************logical && *******************
		
		public static void logical_ANd()
		{
		
	    System.out.print("**********Logical And**********");

		int a=20;
		int b=40;
		int c=60;

		boolean z=a<b && b<c;
		System.out.println(z);
		
		boolean y=a>b && b<c;
		System.out.println(y);
		
		boolean x=a==b && b>c;
			System.out.println(x);
	
	
	}
	
	   // *******************logical OR *****************
		
		
	public static void Logical_OR() {
		
	System.out.println("***********LOgical OR***********");
		
		
	int a=20;
	int b=40;
	int c=60;
	
	boolean z=a>c||b>c;
	
	System.out.println(z);
	
	boolean y= c>b|| c<b;
	System.out.println(y);
	
	boolean x= a==b||a<c;
	System.out.println(x);
		
	}
	

}
