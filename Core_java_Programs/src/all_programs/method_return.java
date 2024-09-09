package all_programs;

public class method_return {
	
	
	public static int add(int a,int b,int c) {
		
		int d=a+b+c;
		 System.out.println(d);
		return d;
		
	}
	 public double sub(double a, double b, double c) {
		 
		 double d=a-b-c;
		 System.out.println(d);
		return d ; 
	 }
	
	
	public static void main(String[] args) {
		 add(10, 20, 30);
		
		 method_return ref=new method_return();
		 
		 ref.sub(50,30 ,5);
		 
		
	}

}
