package this_Keyword;

public class This_keyword {
	
	int a= 1001;
	String b= "Oyye Raju";
	
	
	public  static void Aus() {
		
		System.out.println("we are champions");
	}
	
	
	public void ind() {
		System.out.println(this.a);
		System.out.println(this.b);
		this.Aus();
		System.out.println("whatever");
	}
	
	
	public static void main(String[] args) {
		This_keyword ref=new This_keyword();
		ref.ind();
		
	}

}
