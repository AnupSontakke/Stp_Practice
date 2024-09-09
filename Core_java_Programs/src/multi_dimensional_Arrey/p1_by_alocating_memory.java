package multi_dimensional_Arrey;

public class p1_by_alocating_memory {
	public static void main(String[] args) {
		
		int[][]anup=new int[4][5];
		
		anup[0][0]=5;
		anup[0][1]=0;
		anup[0][2]=7;
		anup[0][3]=2;
		
		anup[1][0]=8;
		anup[1][1]=2;
		anup[1][2]=1;
		anup[1][3]=9;
		
		anup[2][0]=2;
		anup[2][1]=0;
		anup[2][2]=4;
		anup[2][3]=2;
		
		anup[3][0]=2;
		anup[3][1]=4;
		anup[3][2]=4;
		anup[3][3]=2;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				
				System.out.print(anup[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
