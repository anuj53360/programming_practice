package leetcode_mayChallenge;

public class StraightLinr {

	 public static boolean checkStraightLine(int[][] coordinates) {
                
		  int m,num,den,i=2;
		  
		  if(coordinates.length==2) {
			  return true;
		  }
		  
		  num=(coordinates[1][1]-coordinates[0][1]);
		  den=(coordinates[1][0]-coordinates[0][0]);
		  
		  while(den==0) {
			  den=(coordinates[i][0]-coordinates[0][0]);
			  if(i==(coordinates.length-1)) {
				  return true;
			  }
			  i=i+1;
		  }

		  m=num/den;
		  for (int j = 1; j < coordinates.length; j++) {
			
			  int lhs=coordinates[j][1]-coordinates[0][1];
			  int rhs=m*(coordinates[j][0]-coordinates[0][0]);
		if(lhs!=rhs) {
			return false;
		}
		  }
		 return true;
	    }
	public static void main(String[] args) {
		int[][] coordinates= {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
		checkStraightLine(coordinates);
	}
}
