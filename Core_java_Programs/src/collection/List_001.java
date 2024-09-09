package collection;

import java.util.ArrayList;

public class List_001 {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> sr_no=new ArrayList<Integer>();
		
		sr_no.add(10);
		sr_no.add(20);
		sr_no.add(30);
		sr_no.add(40);
		sr_no.add(50);
		sr_no.add(null);
		sr_no.add(50);
		
		

		System.out.println(sr_no); //we see collection
		
		System.out.println(sr_no.clone());// we create exact copy of our collection
		
		System.out.println(sr_no.get(3));// we get the value of index
		System.out.println(sr_no.contains(0));
	//	System.out.println(sr_no.getLast()); //we get the the 1st no.
	//System.out.println(sr_no.getFirst());//we get last number of collection
		
		sr_no.remove(3); // remove the index 3
		System.out.println(sr_no);
		
		sr_no.clear(); // clear the data
		System.out.println(sr_no);
		
		
	}

}
