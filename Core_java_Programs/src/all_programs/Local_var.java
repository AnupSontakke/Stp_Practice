package all_programs;

public class Local_var {
	
	//inside the class and inside the method

	public void addition () {
		int a=56;
		System.out.println(a);
	}
	
	public void sub() {
		byte b= 23;
		System.out.println(b);
	}
		
	public static void main(String[] args) {
		int c=11;
		System.out.println(c);
		Local_var ref=new Local_var();
		ref.addition();
		ref.sub();
		
		
	}

}
