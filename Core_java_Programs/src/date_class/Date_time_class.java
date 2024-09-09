package date_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_time_class {
	public static void main(String[] args) {
		
		//create the object of date class
		
		//use toString method
    	Date d=new Date();
		
		System.out.println(d.toString());
		
		
		
		//Simple Date Formate
		
		//create object for simple date formate class
		
		
		SimpleDateFormat s1=new SimpleDateFormat("DD-MM-YYYY");
		System.out.println(s1.format(d));
		
		
		
		SimpleDateFormat s2=new SimpleDateFormat("hh.mm.ss");
		System.out.println(s2.format(d));
		
		
		SimpleDateFormat s3=new SimpleDateFormat("hh.mm.ss -dd-MM-YYYY");
		System.out.println(s3.format(d));

	}

}
