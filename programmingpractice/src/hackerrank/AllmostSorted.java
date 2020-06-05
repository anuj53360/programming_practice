package hackerrank;

import java.util.Vector;

public class AllmostSorted {

	
	static void almostSorted(int[] arr) {
		int n=arr.length;
		 Vector<Integer> vec=new Vector<Integer>();
	        for(int i=0;i<n-1;i++)
	            if(arr[i]>arr[i+1])
	            vec.add(i);
	            int v_size=vec.size();
	        if(v_size==0)
	            System.out.println("yes");
	        else if(v_size==1)
	        {
	            if(n==2)
	                System.out.println("yes\nswap "+(vec.get(0)+1)+" "+(vec.get(0)+2));
	            else if(arr[vec.get(0)]<arr[vec.get(0)+2])
	                    System.out.println("yes\nswap "+(vec.get(0)+1)+" "+(vec.get(0)+2));
	                else
	                    System.out.println("no");            
	        }
	        else if(v_size==2)
	            System.out.println("yes\nswap "+(vec.get(0)+1)+" "+(vec.get(1)+2));
	        else if(vec.get(v_size-1)-vec.get(0)+1==v_size)
	            System.out.println("yes\nreverse "+(vec.get(0)+1)+" "+(vec.get(v_size-1)+2));
	            else
	            System.out.println("no");
	    } 
		      
	public static void main(String[] args) {
   		int []arr= {4 ,2};
		almostSorted(arr);
	}
}
