package scanner_class;

import java.util.Scanner;

public class Scanner_Class_1_for_int_value {
	
	public static void main(String[] args) {
		
		//scanner class for integer datatype
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter first value...");
			int a=sc.nextInt();
			System.out.println("enter second value...");
			int b=sc.nextInt();
			
			System.out.println("adition of both value");
			System.out.println(a+b);
		}
	}

}
