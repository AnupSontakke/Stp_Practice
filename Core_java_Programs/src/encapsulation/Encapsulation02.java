package encapsulation;

public class Encapsulation02 {
	
	private String password ="Anup1111@";
	
	private void login( String sufi) {
		
		password=sufi;
	}

	public static void main(String[] args) {
		Encapsulation02 anup=new Encapsulation02();
		System.out.println("orignal password:-"+anup.password);
		System.out.println("****************");
		anup.login("sontakke@123");
		System.out.println("dublicate password:-"+anup.password);
		
		
	}
}
