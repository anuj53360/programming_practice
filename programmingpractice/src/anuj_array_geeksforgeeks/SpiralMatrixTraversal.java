package anuj_array_geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixTraversal {

	public static List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> result=new ArrayList<>();
		
		int rowstart=0;
		int columnstart=0;
		int rowend=matrix.length-1;
		int columnend=matrix[0].length-1;
		
		while(rowstart<rowend && columnstart<columnend) {
			for (int i = columnstart; i < columnend; i++) {
				result.add(matrix[rowstart][i]);
			}
			
			
			for (int i = rowstart; i < rowend; i++) {
				result.add(matrix[i][columnend]);
			}
			
			for(int i = columnend; i > columnstart; i--){
                result.add(matrix[rowend][i]);
            }
            for(int i = rowend; i > rowstart; i--){
                result.add(matrix[i][columnstart]);
            }
            
			rowstart++;
			rowend--;
			columnstart++;
			columnend--;
		}
			if(rowstart == rowend){
	            for(int i = columnstart; i <= columnend; i++){
	                result.add(matrix[rowstart][i]);
	            }
	        }else if(columnstart == columnend){
	            for (int i = rowstart; i <= rowend; i++){
	                result.add(matrix[i][columnstart]);
	            }
			
			
		}
		
		return result;

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	    spiralOrder(matrix);
	}
}
