package exception;



public class Try_Multiple_catch {
	
public void meta() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 catch (ArithmeticException e) 
		{System.out.println("handeled");};
		 
	
	}
		
	

	public static void main(String[] args) {
		Try_Multiple_catch av=new Try_Multiple_catch();
		av.meta();
		
		
		
		System.out.println("exception Handeled");
	
	}}
	
