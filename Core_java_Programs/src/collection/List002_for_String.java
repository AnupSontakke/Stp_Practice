package collection;

import java.util.ArrayList;


//Arrelist002_for_String

public class List002_for_String {
	
	public static void main(String[] args) {
		
		ArrayList <String> Subject=new ArrayList<String>();
		

		Subject.add("Marathi");
		Subject.add("English");
		Subject.add("Hindi");
		Subject.add("math");
		Subject.add("Histry");
		Subject.add("hindi");
	System.out.println(Subject); //we see collection
		
		System.out.println(Subject.clone());// we create exact copy of our collection
		
		System.out.println(Subject.get(3));// we get the value of index
		System.out.println(Subject.contains(0));
	//System.out.println(Subject.getLast()); //we get the the 1st no.
//	System.out.println(Subject.getFirst());//we get last number of collection
		
		Subject.remove(3); // remove the index 3
		System.out.println(Subject);
		
		Subject.clear(); // clear the data
		System.out.println(Subject);
		
		
		
	}

}
