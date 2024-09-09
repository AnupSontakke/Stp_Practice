package single_Dimensional_array;

public class single_Dimensional_arrey {
	
	// single_Dimensional_arrey for string value
	
	public static void main(String[] args) {
		
		String []subject =new String[6];
		
		subject[0]="English";
		subject[1]="Marathi";
		subject[2]="Hindi";
		subject[3]="Urdu";
		subject[4]="Panjabi";
		subject[5]="Malayam";
		
		
		for(int i=0;i<6;i++) {
			System.out.println(subject[i]);
		}
		
		System.out.println(subject.length);  //for length
		System.out.println(subject[3]);  //index 
		
	}
	
	

}
