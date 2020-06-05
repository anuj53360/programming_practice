package leetcode;

public class MinimumPathSum {

	 public static int minPathSum(int[][] grid) {
      int m=grid.length-1;
      int n=grid[0].length-1;
		 
       int sum=0;
       for (int i = 0; i <grid.length; i++) {
		sum+=grid[0][i];
		grid[0][i]=sum;
	}
    
       sum=0;
       for (int i = 0; i <grid[0].length; i++) {
   		sum+=grid[i][0];
		grid[i][0]=sum;
   	}
		sum=0; 
       for (int i = 1; i < grid.length; i++) {
    	   for (int j = 1; j < grid[0].length; j++) {
			int min=Math.min(grid[i-1][j], grid[i][j-1]);
			sum=grid[i][j]+min;
			grid[i][j]=sum;
    	   }
	}
       
		 
		 return grid[m][n];
	    }
	
	public static void main(String[] args) {
		
		int [][]grid= {{1,3,1},
				  {1,5,1},
				  {4,2,1}};
		minPathSum(grid);
	}
}
