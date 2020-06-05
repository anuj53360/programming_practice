package anuj_array_geeksforgeeks;

import java.util.Arrays;

public class SquareSubArray {

	
public static int[] sortedSquares(int[] A) {
	
	 int length =A.length;
	 int temp=0;
	
	for(int i=0;i<length;i++) {
		int square=Math.abs(A[i])*Math.abs(A[i]);
		temp=A[i];
		A[i]=square;
		}
	Arrays.sort(A);
return A;
        }
	
	public static void main(String[] args) {
	        
     int [] array= {-7,-3,2,3,11};
     
    int []a=sortedSquares(array);
    
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]);
    }
    
		
		}

}
