package inheritance;



public class Single_Level extends parent_class  {
	int d=390;
	
	public void anup() {
		System.out.println("Child Class");
		System.out.println("*******************");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("1) ************IS relationship***************");
		Single_Level ref=new Single_Level();
		System.out.println(ref.d);
		ref.anup(); //child class
		monu(); //parent class
		System.out.println("2) ****************HAs relationship************");
		parent_class ref2=new parent_class();
		 ref2.monu();
		 
		 System.out.println("3) ************ method Overrinding Relationship***************");
		 parent_class ref3=new Single_Level();
		 ref3.monu();
		
	}
	

}


	
