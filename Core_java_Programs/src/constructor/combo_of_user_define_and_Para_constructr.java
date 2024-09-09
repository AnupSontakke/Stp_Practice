package constructor;

public class combo_of_user_define_and_Para_constructr {
	
	 combo_of_user_define_and_Para_constructr(){
			System.out.println("Hello dear I am a User_define Constuctor");
			
			System.out.println("___________________________________________________________");
		}
	
	 
	 
	 combo_of_user_define_and_Para_constructr(int a, String b,float c){
			System.out.println("Hello dear I am a parameterized Constuctor");

			

		 System.out.println("The value of a is= "+a);
		 System.out.println("The value of b is= "+b);
		 System.out.println("The value of c is= "+c);
		 
		 
		 
	 }
	 

	 public static void main(String[] args) {
		 combo_of_user_define_and_Para_constructr ref=new combo_of_user_define_and_Para_constructr();
		 combo_of_user_define_and_Para_constructr ref1=new combo_of_user_define_and_Para_constructr(15,"bhaI",6.9F);;
		 
		 
		
	}
}
