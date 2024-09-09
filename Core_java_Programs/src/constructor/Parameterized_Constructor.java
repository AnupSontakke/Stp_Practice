package constructor;

public class  Parameterized_Constructor {
	 Parameterized_Constructor(int a, String b, double c){
		 
		 System.out.println(" Hello I Am Parameterized_Constructor");
		
		 System.out.println("The value of a is= "+a);
		 System.out.println("The value of b is= "+b);
		 System.out.println("The value of c is= "+c);
		 
	 }

	public static void main(String[] args) {
		Parameterized_Constructor ref=new Parameterized_Constructor(1,"anup",3.0f);
		
	}

}
