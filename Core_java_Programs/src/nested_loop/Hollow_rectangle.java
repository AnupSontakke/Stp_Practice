package nested_loop;

public class Hollow_rectangle {
	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=7;b++){
				if(a==1||a==5||b==1||b==7) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
				
			}System.out.println();
		} 
	}


}
