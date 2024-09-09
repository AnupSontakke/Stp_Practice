package polymorphism;


public class Compailetime_PolymorPhism{
	
		
	// method overloading.....................................
	
		public void Vivo() {
			System.out.println("no  formal argument mehod");
			System.out.println("***************************************");
		}
		
		public void Vivo(int a) {
			System.out.println("1 formal argument mehod");
			System.out.println("***************************************");
		}
		
		public void Vivo(int a,String b) {
			System.out.println("2 formal argument mehod");
			System.out.println("***************************************");
		}
		
		public void Vivo(int a,String b,float c) {
			System.out.println("3 formal argument mehod");
			System.out.println("***************************************");
		}
		
		public static void main(String[] args) {
			 Compailetime_PolymorPhism ref=new   Compailetime_PolymorPhism();
			 ref.Vivo();
			 ref.Vivo(2);
			 ref.Vivo(3, "Rups");
			 ref.Vivo(4, "Amir", 0);
		}

	}



