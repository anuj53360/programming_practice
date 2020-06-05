package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;

public class MigratoryBirds {

   public static void migratoryBird(int []array) {
	   
	   Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	   
	   for (int i = 0; i < array.length; i++) {
		   if(!map.containsKey(array[i])) {
			   map.put(array[i], 1);
		   }else {
			   map.put(array[i], map.get(array[i])+1);
		   }
	}
     int max=0;
     int large=0;
     int maxmapValue=Collections.max(map.values());
	    for (Entry<Integer, Integer> it : map.entrySet()) {
		          
		          if(it.getValue()==maxmapValue) {
		        	      max=it.getKey(); 
		        	      break;
		          }
		}
	    System.out.println(max);
	    
     
    
	   
	   
   }
	
	public static void main(String[] args) {
		int []array= {1 ,2 ,3 ,4 ,5 ,4, 3, 2 ,1 ,3 ,4};
		migratoryBird(array);
	}
}
