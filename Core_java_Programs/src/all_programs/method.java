package all_programs;

public class method {
	
	// two type of method 1. static method 2. instance/non-static method
	
		//Static method
		
	public static void hinganghat()	{
		
		  String str="my bike is awesome";
		  boolean tiktok = false;
		System.out.println("Nirmal ke samose ke aage koyi bol sakta hai kya");
		System.out.println(" tu chal main aaya");
		System.out.println(str);
		System.out.println(tiktok);
		
		}
	
		
// instance method
	
	public void wardha() {
		
		int java= 32;
		
System.out.println("bajaj chouk ka pool ka kamm??");
System.out.println("agnihotri college");
System.out.println(java);
		
	}
	
public static void main(String[] args) {
	hinganghat(); //called directy 
	
	System.out.println("***********Time Out***********");
	
method bhai =new method(); //creat obj for wardha method 

bhai.wardha(); //called the method by using ref. var

	
}
}
