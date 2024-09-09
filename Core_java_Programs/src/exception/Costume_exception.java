package exception;

import java.util.Scanner;

public class Costume_exception {
	public static void main(String[] args)throws Exception {
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Please Enter Your Age");
		int age=Sc.nextInt();
		
		
		if (age<18) {throw new Exception("Oppps sorry...");
	}
		else {System.out.println("Welcome you can vote now........ ");

	}}}

