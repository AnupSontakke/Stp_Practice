package all_programs;

public class Static_variable {
	
	//we can create inside the class but out side the method
	
	static long a=700;
	
	public void raghu() {
		System.out.println(a);
	}
	
	public static void ramu () {
		
		System.out.println(a);
		
	}
public static void main(String[] args) {
	Static_variable as=new Static_variable();
	
	as.raghu();
	System.out.println(a);
	System.out.println(Static_variable.a);
}
}
 