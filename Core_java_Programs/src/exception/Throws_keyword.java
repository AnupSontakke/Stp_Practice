package exception;

public class Throws_keyword {

	
	public static void main(String[] args) throws InterruptedException {
		
int[]emp=new int[6];   //to add the value
		
		emp[1]=30;
		emp[2]=70;
		emp[3]=80;
		emp[4]=20;
		emp[5]=10;
	 
		Thread.sleep(3000);
		
		for(int a:emp) {
			System.out.println(a);
		}
		
	}

}
