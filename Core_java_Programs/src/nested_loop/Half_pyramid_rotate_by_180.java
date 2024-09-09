package nested_loop;

public class Half_pyramid_rotate_by_180 {

	public static void main(String[] args) {
		for(int a=1;a<=4;a++) {
			for (int b=1;b<=4-a; b++) {
			System.out.print(" ");
			}
			for (int c=1;c<=a;c++) {
				System.out.print("*");
			
		}System.out.println();
		}
	}

}
