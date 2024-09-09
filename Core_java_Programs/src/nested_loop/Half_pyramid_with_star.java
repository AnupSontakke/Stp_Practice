package nested_loop;

public class Half_pyramid_with_star {

	public static void main(String[] args) {
		
		for(int a=1;a<6;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
