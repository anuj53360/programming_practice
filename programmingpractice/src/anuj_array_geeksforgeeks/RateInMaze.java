package anuj_array_geeksforgeeks;

public class RateInMaze {

	public static boolean rateinMaze(int [][]grid) {
		int n=grid.length;
      int [][]sol=new int[n][n];		
		
		if(solvemazeUtil(grid,0,0,sol)==false) {
			System.out.println("no path exist");
		return false;
		}
		//printsolutionath(sol);
		return true;
	}
	
	public static boolean solvemazeUtil(int [][]grid,int x,int y,int [][]sol) {
		int n=grid.length;
		if(x==n-1 && y==n-1 && grid[x][y]==1) {
			sol[x][y]=1;
			return true;
		}
		
		if(isSafe(grid,x,y)==true) {
			sol[x][y]=1;
		
		if(solvemazeUtil(grid, x+1, y, sol))
		return true;
		
		if(solvemazeUtil(grid, x, y+1, sol))
			return true;
		sol[x][y]=0;
		return false;
		
		}
		
		
		
		return false;
	}
	
	
	public static boolean isSafe(int [][]grid,int x,int y) {
	int n=grid.length;
		if(x>=0 && x<=n-1 && y>=0 && y<=n-1 && grid[x][y]==1)
		return true;;
		return false;
	}
	
	
	public static void main(String[] args) {
		int [][]grid= { { 1, 0, 0, 0 }, 
                { 1, 1, 0, 1 }, 
                { 0, 1, 0, 0 }, 
                { 1, 1, 1, 1 }};
		rateinMaze(grid);
	}
}
