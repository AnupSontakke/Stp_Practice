package abtraction;

public class Concrate_class  {
	
	public void Maharatra() {
		System.out.println("Puranpoli");
	}
	

	public static void main(String[] args) {
		Concrate_class ref=new Concrate_class();
		ref.Maharatra();
		ref.panjab();
		ref.karnataka();
		ref.bihar();
		
		
	}
	
	public void panjab() {
		System.out.println("Chole-Bhatule");
	}
	
	public void karnataka() {
		System.out.println("idali-dosa");
	}
	
	public void bihar() {
		System.out.println("pani-puri");
	}
	
}
