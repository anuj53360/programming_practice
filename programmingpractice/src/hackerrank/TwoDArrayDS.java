package hackerrank;

public class TwoDArrayDS {

	public static void twoDArrayDS(int array[][]) {
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
			
				
				System. out.print(array[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[] args) {

		int array[][]= {{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},
				{0,0,8,6,6,0},{0,0,0,-2,0,0},{0 ,0 ,1,2,4,0}
		        };
	
	twoDArrayDS(array);
	
	}
	
	
}
