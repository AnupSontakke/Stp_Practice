package do_while_loop;

public class do_while_loop2 {
	
	//we print the all even value in range of 1 to 100.
	public static void main(String[] args) {
		
		int x=1;
		do { 
			if(x%2==0) {
				System.out.println(x);
			}
			x++;
		}while(x<=100);
	}

} 



