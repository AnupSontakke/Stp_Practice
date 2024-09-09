package multi_dimensional_Arrey;

public class p2_without_alocating_memory {
	
	
	public static void main(String[] args) {
		
		int[][] queen= {{1,2,3,4},{2,3,5,6},{7,8,9,0}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				
				System.out.print(queen[i][j]+" ");
				
			}
			System.out.println();
		}
		
		}
		
		
	}
	


