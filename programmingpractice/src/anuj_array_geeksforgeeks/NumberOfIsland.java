package anuj_array_geeksforgeeks;

public class NumberOfIsland {

	 int n;
	int m;
	public  int noOfIsland(char [][]grid) {
		int n=grid.length;
		int m=grid[0].length;
		int count=0;
		if(grid.length==0) {
			return 0;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
             		if(grid[i][j]==1) {
             			noOfIslandUtil(i,j,grid);
             			count++;
             		}		
			}
		}
	return count;
	}
	

	public  void noOfIslandUtil(int i,int j,char [][]grid){
		if(i<0 || i>=n && j<0 || j>=m || 
				grid[i][j]!=1) {
			return;
		}
		grid[i][j]=0;
		noOfIslandUtil(i+1, j, grid);
		noOfIslandUtil(i-1, j, grid);
		noOfIslandUtil(i, j+1, grid);
		noOfIslandUtil(i, j-1, grid);
	
	}
	public static void main(String[] args) {
		char [][]array={ { 1, 1, 0, 0, 0 }, 
                { 0, 1, 0, 0, 1 }, 
                { 1, 0, 0, 1, 1 }, 
                { 0, 0, 0, 0, 0 }, 
                { 1, 0, 1, 0, 1 } };
		NumberOfIsland nm=new NumberOfIsland();
		int count=nm.noOfIsland(array);
	System.out.println(count);
	}
}
