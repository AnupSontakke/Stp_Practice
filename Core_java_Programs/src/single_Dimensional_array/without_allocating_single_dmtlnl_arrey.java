package single_Dimensional_array;

// 2nd type of single dimentionl arreay

public class without_allocating_single_dmtlnl_arrey {
	
	public static void main(String[] args) {
		float[]percent={88.12f,98.56f,45.65f,97.86f};
		
		System.out.println("the leanth of array is:"+percent.length);
		System.out.println("using for each loop");
		
		for(float h:percent) {
			System.out.println(h+" ");
		}
		
	}

}
