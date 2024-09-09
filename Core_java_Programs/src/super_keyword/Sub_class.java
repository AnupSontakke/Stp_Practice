package super_keyword;

public class Sub_class extends supar_Class{
	int a=13;
	String b="Vivo";
	
	public static void  samsung()   {
		
		
		
		
		System.out.println("im a  half apple");
		
		}
	
	public void subclass() {
		System.out.println(this.a);
		System.out.println(this.b);
		Sub_class.samsung();
		
		System.out.println("sub-class methode");
		
		//call all superclass member then we used super keyword 
		System.out.println("******super class members**********");
		
		System.out.println(super.a);
		System.out.println(super.b);
		  super.samsung();
	      //super.superclass();
		
		System.out.println("sub-class methode");
		
	}
	 public static void main(String[] args) {
		 Sub_class sub= new Sub_class();
		 sub.subclass();
				 
		
	}
	

}
