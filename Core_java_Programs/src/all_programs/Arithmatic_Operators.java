package all_programs;

public class Arithmatic_Operators {
	
	public static void addition() {
		
		int a=20;
		int b=30;
		
		System.out.println("the addition:-"+a+b);
				
	}
	
	public void sub() {
		int c=20;
		int d=30;
		System.out.println(d-c);
	}
		
	
	public void mul() {
			
			 float a=50;
			 double b=11.3;
			 
				
				System.out.println(a*b);
				 
			 }
		
		public static void div() {
			
			long a = 100;
			short b= 20;
			
			System.out.println(a/b);
		}
		
	

	
	public static void main(String[] args) {
		System.out.println("all rasult shown below");
		addition();
		Arithmatic_Operators ref=new Arithmatic_Operators();
		ref.sub();
		ref.mul();
		div();
	}
	
	
}
