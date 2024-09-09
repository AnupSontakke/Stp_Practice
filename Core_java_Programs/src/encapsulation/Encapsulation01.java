package encapsulation;

public class Encapsulation01 {
	
	
		
		private int Money=9900;
		
		private void Atm(int a) {
			
			Money=a;
			System.out.println(a);
			
		
	}
		public static void main(String[] args) {
			Encapsulation01 anup=new Encapsulation01();
			System.out.println(anup.Money); //directly call
			System.out.println("***************************************");
			
			anup.Atm(20000);
			
			System.out.println(anup.Money);//hide the orignl amt and show the fake amt.
			
		}

}
