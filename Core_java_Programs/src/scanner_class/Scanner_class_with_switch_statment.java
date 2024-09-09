package scanner_class;

import java.util.Scanner;

public class Scanner_class_with_switch_statment {
	
	//scanner class with switch statment
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a=sc.nextInt();
		
		System.out.println("enter the 2nd number");
		int b=sc.nextInt();
		
		System.out.println("choose any one operators like +,-,*,/");
		char c=sc.next().charAt(0);
		
		switch (c) {
		case '+':
			System.out.println("addtion of two number:--" +(a+b));
			break;
			
		case '-':
			System.out.println("subtraction of two number:--"+(a-b));
			break;
			
		case '*':
			System.out.println("multiplication of two number:--"+a*b);
			break;
			
		case '/':
			System.out.println("addtion of two number:--"+a/b);
			break;
			
			
			default:
				System.out.println("none of above");
		
		
		}
		
		
		
		
		
	}

}
