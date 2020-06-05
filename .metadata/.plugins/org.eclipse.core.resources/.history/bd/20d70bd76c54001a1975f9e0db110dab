package anuj_array_geeksforgeeks;

import java.util.Arrays;

public class PhythorgianTriplet {

	public static void phythorgianTriplet(int []array) {
		
		int []newarray=new int[array.length];
		for (int i = 0; i <array.length; i++) {
			newarray[i]=array[i]*array[i];
		}
		Arrays.sort(newarray);
		printArray(newarray);
		
		for (int i = newarray.length-1; i >1; i--) {

			int startindex=0;
			int endindex=i-1;
			
			while(startindex<endindex) {
				if(newarray[startindex]+newarray[endindex]==newarray[i]) {
					System.out.println("YES");
				} 
				if(newarray[startindex]+newarray[endindex]<newarray[i]) {
					startindex++;
				}else {
					endindex--;
				}
			}
			
		}
		
		
		
	}
	
	public static void printArray(int []newarray) {
		for (int i = 0; i < newarray.length; i++) {
			System.out.println(newarray[i]);
		}
	}
	public static void main(String[] args) {
		int []array= { 3, 1, 4, 6, 5 };
		phythorgianTriplet(array);
	}
}
