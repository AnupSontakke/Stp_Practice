package map;

import java.util.HashMap;

public class Map___Has_map {
	
	//map interface

	public static void main(String[] args) {
		
		HashMap<Integer,String> sia=new 	HashMap<Integer,String> ();
		
		
		sia.put(1, "Anup");
		sia.put(2, "Rohit");
		sia.put(3, "Rohit");
		sia.put(4, "Rohit");
		sia.put(5, "Rasmi");
		sia.put(6, "Shubham");
		sia.put(7, "Umesh");
	
		System.out.println(sia);
		
		System.out.println(sia.clone());
		System.out.println(sia.isEmpty());
		
		System.out.println(sia.get(sia));
		System.out.println(sia.size());
		System.out.println(sia.keySet());
		
		sia.remove(1);// remove the key
		System.out.println(sia);
		
		sia.clear();
		System.out.println(sia);
		

	}

}
