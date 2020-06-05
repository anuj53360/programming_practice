package anuj_array_geeksforgeeks;

import java.util.Arrays;

public class MinimumPlatform {

	public static void minimumPlatform(int arr[],int dep[],int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int minimumplatform=1;
		int platfromneeded=1;
		int i=1;
		int j=0;
		while(i<arr.length && j<dep.length) {
        if(arr[i]<=dep[j]) {
        	minimumplatform++;
        	i++;
        if(platfromneeded<minimumplatform) {
        	platfromneeded=minimumplatform;
        }
        }		else {
        	minimumplatform--;
        	j++;
        }
		}
		System.out.println(platfromneeded);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
	    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
	    int n=arr.length;
		minimumPlatform(arr,dep,n);
	}
}
