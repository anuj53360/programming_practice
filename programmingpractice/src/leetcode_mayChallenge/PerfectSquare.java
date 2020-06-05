package leetcode_mayChallenge;

public class PerfectSquare {

	
public static boolean isPerfectSquare(int num) {
	int ld=num%10;
	
	if(ld==2|| ld==3|| ld==7 || ld==8) {
		return false;
	}
	
	if(num==1) {
		return true;
	}
	     int end =num/2;
	   int start=2;
	     
	return isPerfectSquareUtil(num,start,end);
    }

public static boolean isPerfectSquareUtil(int num, long start,long end){
	
	while(start<=end) {
		 long mid=start+(end-start)/2;
		System.out.println(mid);
		 if((mid*mid)==num) {
	        	System.out.println("AAA");
	        	return true;
	        }
		 else if((mid*mid)>num) {
	        	end=mid-1;    	
	        }else {
	        	start=mid+1;
	        }
	}
	return false;
       
       
}
	
	public static void main(String[] args) {
		int num=808201;
		boolean x=isPerfectSquare(num);
		System.out.println(x);
	}
}
