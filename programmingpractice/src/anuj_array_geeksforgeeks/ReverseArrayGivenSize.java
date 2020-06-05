package anuj_array_geeksforgeeks;

public class ReverseArrayGivenSize {

	public static void reversearray(int []array,int k) {
		
		for (int i = 0; i < array.length; i+=k) {
			int left=i;
			int right=Math.min(i+k-1, array.length-1);
			int temp=0;
			while(left<right) {
            temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
			}
		}
		
for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
}		
	}
	
	public static void main(String[] args) {
		int []array= {1, 2, 3, 4, 5, 6, 7, 8};
		int k=3;
		reversearray(array,k);
	}
}
