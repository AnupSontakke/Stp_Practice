package interface__1;

public class Class001 implements interface___1, Interface2 {

	@Override
	public void tab() {
	System.out.println("hi I am Tab----(interface 2)");
		
	}

	@Override
	public void laptop() {
	System.out.println("Laptop walla bhau----(interface 1)");
		
	}

	@Override
	public void mobile() {
	System.out.println("mobile wale bhaiyya ji -----(interface 1)");
	
	}
	
	
	public static void main(String[] args) {
		
		Class001 ref= new Class001();
		ref.tab();
		ref.laptop();
		ref.mobile();
		System.out.println(ref.a);
		System.out.println(ref.b);
		
	}

}
