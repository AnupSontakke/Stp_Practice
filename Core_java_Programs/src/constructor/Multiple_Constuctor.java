package constructor;

public class Multiple_Constuctor {
	
	Multiple_Constuctor(int a){
		this(14,1.3f);
		
			 
			 System.out.println(" Hello I Am _Multiple_Constuctor");
			
			 System.out.println("The value of a is= "+a);
			 
			 
			 System.out.println("----------------------------------------------------------");
			 
			 
		}
		
		Multiple_Constuctor(int a,float b){
			this(14,1.3f,"String",'Q');
			
				 
				 System.out.println(" Hello I Am _Multiple_Constuctor");
				
				 System.out.println("The value of a is= "+a);
				 System.out.println("The value of b is= "+b);
				 
				 System.out.println("----------------------------------------------------------");
				 

				 

			}
		
		Multiple_Constuctor(int a,float b,String c){
			
			
				 
				 System.out.println(" Hello I Am _Multiple_Constuctor");
				
				 System.out.println("The value of a is= "+a);
				 System.out.println("The value of b is= "+b);
				 System.out.println("The value of c is= "+c);
				 
				 System.out.println("----------------------------------------------------------");
				 

				 

			}
		
		Multiple_Constuctor(int a,float b,String c,char d){
			
		
			
				 
				 System.out.println(" Hello I Am _Multiple_Constuctor");
				
				 System.out.println("The value of a is= "+a);
				 System.out.println("The value of b is= "+b);
				 System.out.println("The value of c is= "+c);
				 System.out.println("The value of d is= "+d);
				 System.out.println("----------------------------------------------------------");
				 

				 

			}


		
		public static void main(String[] args) {
			
			Multiple_Constuctor ref=new Multiple_Constuctor(12);
			
	

			
			
		}
	}
			
		
			
			
		
