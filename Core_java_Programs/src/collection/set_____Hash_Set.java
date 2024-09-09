package collection;

import java.util.HashSet;

public class set_____Hash_Set {

	public static void main(String[] args) {
		
		HashSet <Integer> anup= new HashSet <Integer> ();
		
			anup.add(15);
			anup.add(16);
			anup.add(null);
			anup.add(17);
			anup.add(18);
			anup.add(19);
			anup.add(20);
			anup.add(15);
			anup.add(null);
			anup.add(null);
			System.out.println(anup);
			
			System.out.println(anup.clone());
			
			
			
			
			System.out.println(anup.isEmpty());
			
			
			System.out.println(anup.size());
			
			anup.remove(15);
			System.out.println(anup);
			
		    anup.clear();
			System.out.println(anup);
			
 
	}

}
