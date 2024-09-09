package collection;

import java.util.LinkedList;

public class List___LinkedList__01 {
	
	public static void main(String[] args) {
		
		LinkedList <Character> vowel=new LinkedList <Character>();
		vowel.add('A');
		vowel.add('E');
		vowel.add('I');
		vowel.add('O');
		vowel.add('U');
		
		System.out.println("Vowel="+vowel);
		
		vowel.remove(2); //remove method and put the index of character
		System.out.println("Vowel="+vowel);
		
		vowel.add('I');
		System.out.println("Vowel="+vowel); //we can add nd remove any time
		
		
		vowel.add(4, 'R');
		System.out.println("Vowel="+vowel);
		
		vowel.clone();//clone method:-we can print all data as it is
		System.out.println("Vowel="+vowel);
		
		vowel.contains(args);
		System.out.println(vowel.contains('A'));
		
		vowel.getFirst();
		System.out.println(vowel.getFirst());
		
		vowel.getLast();
		System.out.println(vowel.getLast());
		
		System.out.println(vowel.pollFirst());
		
		System.out.println(vowel.pollLast());
		
		System.out.println("size="+vowel.size());
		System.out.println(vowel.lastIndexOf('R'));
		
		System.out.println(vowel.equals(vowel));
		
		vowel.clear();//all data cleared
		System.out.println(vowel); 
		


		
		
		
		
	
	}

}
