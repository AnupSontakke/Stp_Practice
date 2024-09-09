package all_programs;

public class instance_variables {
	
	//3 type of variables 1.Instance  variable:-we can initial inside the class but out side the method
	
	int ac=30;
	
	public void redmi () {
		
		System.out.println( ac);
	}  
	
	public static void nokia() {
	
		instance_variables nokia=new instance_variables();		
		System.out.println(nokia.ac);
		System.out.println("ohhhlaala");
	}
	
 public static void main(String[] args) {
	 instance_variables z=new instance_variables();
	 
	 System.out.println("kitkat");
	 z.redmi();
	nokia();
}
}
