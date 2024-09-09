package wrapper_class;

public class Wrapper_class2 {
	public static void main(String[] args) {
		//TYPE :- convert wrapper class into datatype
		
		//for int
		Integer an=new Integer(100);
		int a=an.intValue();
		System.out.println(a);
		
		
		//for float
		Float ft=new Float(33.33f);
		float f=ft.floatValue();
		System.out.println(f);
		
		//for char
		Character ch=new Character('N');
		char c=ch.charValue();
		System.out.println(c);
		
	}

}
