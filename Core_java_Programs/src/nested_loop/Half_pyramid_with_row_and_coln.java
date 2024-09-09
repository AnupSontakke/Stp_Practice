package nested_loop;

public class Half_pyramid_with_row_and_coln {
	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(a+","+b+"  ");
			}
			System.out.println();
		}
		
	}

}
