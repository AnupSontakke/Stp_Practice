package super_keyword;

public class supar_Class {
	
	
	int a=15;
	String b="Hello";
	
	public static void  samsung() {
		System.out.println("hello I am CEo OF SaMsUnG");
	}
	
	public void superclass() {
		System.out.println(this.a);
		System.out.println(this.b);
		supar_Class.samsung();
		
		System.out.println("super-class medthod");
	}
	public static void main(String[] args) {
		
		supar_Class  sup= new supar_Class ();
		sup.superclass();
		
	}

}
