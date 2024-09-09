package task;

public class Task_2 {

	public static void main(String[] args) {
		
		whileloop();
		System.out.println("******************");
		do_whileloop();
		
	}
		
		
		//1 task  i have use  while loop and  decrement the value and skip the 25.9 number
		
		public static void whileloop() {
	   double anup=30.9;
	   while(anup>=20.9) 
	     {
		   anup--;
		   
		   if(anup==25.9) 
		
		 {
			
			   continue;
		 }
		   System.out.println(anup);
		 }
	   
	   	}

		// 2nd task  i skip 59 number by using do-while-loop with continue jump statment
		public static void do_whileloop() {
			
			int shona=56;
			do {
				
				shona++;
				
				if(shona==59)
				{
				continue;
				}
				
				System.out.println(shona);
				
			}while(shona<63);
			
		}
}
