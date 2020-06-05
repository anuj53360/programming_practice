package leetcode_mayChallenge;

public class FindTownJudge {

	
	 public static int findJudge(int N, int[][] trust) {
	        
		 int []trusting=new int[N];
		 
		for (int [] t : trust) {
			trusting[t[0]-1]--;
			trusting[t[1]-1]++;
		}
		
		int result=-1;
		
		for (int i = 0; i < N; i++) {
			if(trusting[i]==N-1) {
				return i+1;
			}
		}
		
		 return result;
	    }
	
	public static void main(String[] args) {
		int[][] trust= {{1,3},{1,4},{2,3},{2,4},{4,3}};
		int N=4;
		findJudge(N,trust);
	}
}
