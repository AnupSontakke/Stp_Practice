package collection;

import java.util.Vector;

public class List__Vector {

	public static void main(String[] args) {
	
		Vector<Float> bro=new Vector<Float> ();
		
		
		
		bro.add(1.1f);
		bro.add(null);
		bro.add(40.7f);
		bro.add(20.30f);
		bro.add(4.7f);
		bro.add(5.8f);
		bro.add(60.20f);
		bro.add(64.6f);
		
		
		System.out.println(bro);
		
		System.out.println(bro.clone());
		
		System.out.println(bro.firstElement());
		System.out.println(bro.capacity());
		
		System.out.println(bro.contains(bro));
		
		System.out.println(bro.size());
		
		bro.remove(3);
		System.out.println(bro);
		
		bro.clear();
		System.out.println(bro);
		


		
		
		
		
	}

}
