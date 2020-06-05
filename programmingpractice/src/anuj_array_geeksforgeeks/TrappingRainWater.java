package anuj_array_geeksforgeeks;

public class TrappingRainWater {

	public static int trappingRainWater(int []array,int n) {
		
		int result=0;
		int leftmax=0;
		int rightmax=0;
		int start=0;
		int end=n-1;
		
		while(start<=end) {
			if(array[start]<array[end]) {
			if(array[start]>leftmax) {
				leftmax=array[start];
			}else {
			result+=leftmax-array[start];
			}
			start++;
			}
			
			else {
				if(array[end]>rightmax) {
					rightmax=array[end];
				}
				else {
				result+=rightmax-array[end];
				}
				end--;
				
			}
		}
		System.out.println(result);
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int []array= { 0, 1, 0, 2, 1, 0, 1, 
                3, 2, 1, 2, 1 };

		trappingRainWater(array,array.length);
		
	}
}
