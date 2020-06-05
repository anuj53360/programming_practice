package leetcode_mayChallenge;

public class FirstBadVersion {

	
	 public static int firstBadVersion(int n) {
	     return firstBadVersionUtil(1,n);   
	    }
	 
	 public static int firstBadVersionUtil(int start,int end){
	    if(start==end) {
	    	return start;
	    }	 
	    int mid=start+(end-start)/2;
		 if(isBadVersion(mid)) {
			 return firstBadVersionUtil(start, mid);
		 }
		 return firstBadVersionUtil(mid+1, end);
	 }
	 
	 public static void main(String[] args) {
		 int n=5;
		 firstBadVersion(n);
	}
}
