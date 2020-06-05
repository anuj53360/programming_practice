package anuj_array_geeksforgeeks;

public class EquibriumPoint {

	public static void equibliumPoint(int []array) {
		
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		int leftsum=0;
		for (int i = 0; i < array.length; i++) {
            sum-=array[i];			
		    
            if(leftsum==sum) {
            	System.out.println(i);
            }
            else {
            	System.out.println(-1);
            }
            leftsum+=array[i];
		}
		
	}
	
	public static void main(String[] args) {
		int []array= {-7, 1, 5, 2, -4, 3, 0 };
		equibliumPoint(array);
	}
}
