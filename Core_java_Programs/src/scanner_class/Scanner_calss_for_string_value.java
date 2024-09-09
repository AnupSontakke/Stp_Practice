package scanner_class;

import java.util.Scanner;

public class Scanner_calss_for_string_value {
	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" ENTER THE 1ST String");
			String str=sc.next();
			
			System.out.println(" ENTER THE 1ST String");
			String str2 =sc.next();
			
			System.out.println("concat the both string value");
			 System.out.println(str+" "+str2);
		}
	
		
		
		
		
	}

}
