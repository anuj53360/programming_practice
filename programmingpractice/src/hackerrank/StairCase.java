package hackerrank;

public class StairCase {

	
	static void staircase(int n) {
     
		for(int i=0;i<n;i++) {
    	   for(int j=0;j<=n-2-i;j++) {
    		   System.out.print(" ");
    	   }
    	   for(int k=n;k>=n-i;k--) {
    		   System.out.print("#");
    	   }
    	   System.out.println( );    	  
       }
    }

	
	public static void main(String[] args) {
		int n=6;
		staircase(n);
	}
}
