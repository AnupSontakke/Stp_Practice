package scanner_class;

import java.util.Scanner;

public class scanner_calss_2_for_float_value {
	
	
	
	//multiplication of float value

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st value  ");
			float a=sc.nextFloat();

			
			System.out.println("Enter 2nd value  ");
			float b=sc.nextFloat();
			
			
			System.out.println("multiplication of 1st and 2nd value" );
			System.out.println(a*b);
		}
		
	}

}
