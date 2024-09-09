package inheritance;

public class Multi_Level extends Single_Level   {
	int c=30;
	
	 Multi_Level(){
		 System.out.println("child class 2");
		 System.out.println("*****************************");
	 }
	
	
	public static void main(String[] args) {
		 Multi_Level ref=new Multi_Level();
		 ref.anup();
		 ref.monu();
		
	}


}
