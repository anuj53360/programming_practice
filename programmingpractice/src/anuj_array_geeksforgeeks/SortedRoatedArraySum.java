package anuj_array_geeksforgeeks;

public class SortedRoatedArraySum {

	public static void SortedRoatedArraySum(int []array,int sum,int n) {
	
		int i=0;
		for ( i= 0; i < array.length; i++) {
			if(array[i]>array[i+1])
			{
				break;
			}
		}
		
		int l=(i+1)%n;
		int r=i;
		System.out.println(l+" "+r+" "+i);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		 
		int []array= {11, 15, 6, 8, 9, 10};
		int sum=16;
		int n=array.length;
		SortedRoatedArraySum(array,sum,n);
	}
}
