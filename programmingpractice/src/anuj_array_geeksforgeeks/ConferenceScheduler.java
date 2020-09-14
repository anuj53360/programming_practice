package anuj_array_geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConferenceScheduler {

	  public static int maxPresentations(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
		
		  Collections.sort(scheduleEnd);
		  Collections.sort(scheduleStart);
		  int n=scheduleStart.size();
		  
		  int i=scheduleStart.get(1);
		  int j=scheduleEnd.get(0);
		  int maxperson=1;
		  int result=1;
		  
		  while (i<n && j<n) {

			  if(scheduleStart.get(i)< scheduleEnd.get(j)) {
				  maxperson++;
				  i++;
			  }
			  
			  else if (scheduleStart.get(i) > scheduleEnd.get(j)) {
				maxperson--;
				j++;
			}
			  
			  
			  if(maxperson>result) {
				  result=maxperson;
			  }
		}
		  
		  
		  
		  
		  
		  
		  
		  
		  return result;

	    }
	
	public static void main(String[] args) {

		List<Integer> scheduleStart=Arrays.asList(6, 1, 2, 3);
		List<Integer> scheduleEnd=Arrays.asList(8, 9, 4, 7);
		int result=maxPresentations(scheduleStart, scheduleEnd);
		System.out.println(result);
		
	}
}
