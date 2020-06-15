package anuj_array_geeksforgeeks;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SubArrayGivenSum {

	public static void subArrayGivenSum(int []array,int sum) {
		
     for(int i=0;i<array.length;i++) {
    	 int new_sum=array[i];
    	 for(int j=i+1;j<array.length;j++) {
    		 new_sum=new_sum+array[j];
    		 System.out.println(new_sum);
    		 if(new_sum==sum) {
    			 System.out.println("1st index"+i+" "+"2nd index"+j);
    		 }
    	 }
     }		
	}
	
	public static void main(String[] args) {
		LinkedHashMap<String, String> has=new LinkedHashMap<>();
		HashMap<String, String> hasm=new HashMap<>();
		int []array= {15,2,4,8,9,5,10,23};
		int sum=23;
		subArrayGivenSum(array,sum);
	}
}
