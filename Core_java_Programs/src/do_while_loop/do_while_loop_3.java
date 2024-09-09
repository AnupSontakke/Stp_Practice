package do_while_loop;

public class do_while_loop_3 {
	//we print the all odd value in range of 1 to 100.
	public static void main(String[] args) {
		
		int x=1;
		do { 
			if(x%2==1) {
				System.out.println(x);
			}
			x++;
		}while(x<=100);
	}


}
