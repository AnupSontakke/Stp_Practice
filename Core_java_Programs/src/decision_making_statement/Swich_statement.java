package decision_making_statement;

public class Swich_statement {
	
		
		 
		
		public static void main(String[] args) {
			
			day(); //  I called day method in main mathod directly by its name static method
			
		}
		
		public static void day() {
			 int day_no=6;
			 String Day="";
			 
			 switch(day_no) {
		
			 

			 case 1:
				 Day="Monday";
				 System.out.println(Day);
				 break;
			 case 2:
				 Day="Tuesday";
				 System.out.println(Day);
				 break;
			 case 3:
				 Day="Wednesday";
				 System.out.println(Day);
				 break;
			 case 4:
				 Day="Thursday";
				 System.out.println(Day);
				 break;
			 case 5:
				 Day="Friday";
				 System.out.println(Day);
				 break;
			 case 6:
				 Day="Saturday";
				 System.out.println(Day);
				 break;
			 case 7:
				 Day="Sunday";
				 System.out.println(Day);
				 break;
				 
				 default:{System.out.println("none of above");
				 
		
			
			 }
		}
			

		}}



