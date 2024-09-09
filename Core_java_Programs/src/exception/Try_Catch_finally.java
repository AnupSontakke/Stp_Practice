package exception;

public class Try_Catch_finally {
public void meta() {
		
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("handeld");
				e.printStackTrace();
			}
		
	finally {
		System.out.println("you are so cute");

	}
		
}
	public static void main(String[] args) {
		Try_Multiple_catch av=new Try_Multiple_catch();
		av.meta();
		
		
		
	//	System.out.println("exception Handeled");
	
	
	}
}
