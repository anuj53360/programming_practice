package hackerrank;

public class RunningMedian {

	public static void runningMedian(int []array) {
		
		int arlength=array.length;
		double median=0;
		if(arlength%2==0) {
			  median=arlength/2;
			  System.out.println(median);
		}else {
			median =arlength/2;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int []array= {12,4};
		runningMedian(array);
		
	}
}
