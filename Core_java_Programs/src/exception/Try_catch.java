package exception;

public class Try_catch {

	public static void main(String[] args) {
	
		System.out.println(1);
		System.out.println(2);
		
		try {
		System.out.println(3);
		System.out.println(4/0);
		}
		catch(ArithmeticException ap) {
		System.out.println("handeld");
		}
		System.out.println(4/32);
	}

}
