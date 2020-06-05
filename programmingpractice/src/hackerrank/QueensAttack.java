package hackerrank;

import java.util.Arrays;

public class QueensAttack {

	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
       int count=0;
       int [][]array=new int[n][n];
       for (int[] row : array) 
           Arrays.fill(row, 0);
		//while(r_q<=n && c_q<=n) {
    
       
       for (int i = 0; i < array.length; i++) {
    	   for (int j = 0; j < array[0].length; j++) {
    		   if((i==4 && j==4) || (i==3 && j==2) || (i==2 && j==3)) {
    			 array[i][j]=1;
   		   }
		}
	}
       
			//same row
			for (int i = 1; i <=n; i++) {
				checkitisSafeOrNot(array,r_q,i);
			}
			
//			for (int i = n; i >=1; i--) {
//				array[i][c_q];
//			}
//			
//			//upper right digonal
//			for (int j = r_q+1; j <= n; j++) {
//				array[j][c_q++];
//			}
//			//down right digonal
//			for (int j = r_q-1; j >=1; j--) {
//				array[j][c_q--];
//			}
//			
//			
//			//upper left digonal
//			for (int j = r_q+1; j <= n; j++) {
//				array[j][c_q--];
//			}
//			//down left digonal
//			for (int j = r_q-1; j >=1; j--) {
//				array[j][c_q++];
//			}
		//}
			
		
		return count;
    }

	
	public static void checkitisSafeOrNot(int [][]array,int r_q,int i){
		int count=0;
		for (int m = 0; m <array.length; m++) {
	    	   for (int n = 0; n <array[0].length; n++) {
			if(array[m][n]==array[r_q][i]) {
				count++;
				System.out.print(m+""+n);
			}
			}
	    	   System.out.println( );
	    	   
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int n=5;
		int k=3;
		int rq=3;
		int cq=2;
		
		byte b=1;
		b+=1;
		System.out.println(b);
		int[][] obstacles= {{4,4},{3,1},{1,2}};
		queensAttack(n,k,rq,cq,obstacles);
		
		
	}
}
