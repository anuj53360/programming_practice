package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BeautifulTRiplet {

	static int beautifulTriplets(int d, int[] arr) {
           
		int count=0;
		int last=arr.length-1;
		while(last>= 0) {
		int lastminusone=last-1;
		Set<Integer> list=new HashSet<>();
		while(lastminusone>=0 ) {
		System.out.println(arr[last]+" "+arr[lastminusone]);
			int minus=arr[last]-arr[lastminusone];
		    if(minus%d==0) {
		    		list.add(arr[last]);
		    	list.add(arr[lastminusone]);
		    	System.out.println(arr[lastminusone]+"!!!!!!!");
		    } 
		    if(list.size()==3) {
		    	count++;
            System.out.println(list.toString());
            break;
		    }
		    lastminusone--;
		}
		last--; 
		}
		System.out.println(count);
		return d;
    }
	
	
	public static void main(String[] args) {
		int []arr= {1 ,6 ,7, 7 ,8 ,10 ,12 ,13 ,14,19};
		int d=3;
		beautifulTriplets(d,arr);
		
	}
}
