package nested_loop;

public class Floyds_tringles {
	public static void main(String[] args) {
		int z=1;
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(z+" ");
				z++;
			}System.out.println();
		}
	}

}
