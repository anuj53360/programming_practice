package anuj_array_geeksforgeeks;

public class RearrangeArrayMaxMinForm {

	public static void rearrangeArray(int []array) {
	
		int []copyarray=new int[array.length];
		
	
		int left=0;
		int right=array.length-1;
		int n=array.length;
		boolean flag=true;
		for (int i = 0; i < n; i++) {
			if(flag) {
				copyarray[i]=array[right--];
			}else {
				copyarray[i]=array[left++];
			}
			
			flag=!flag;
		}
		for (int j = 0; j < copyarray.length; j++) {
			System.out.println(copyarray[j]);
		}
	}
	
	public static void main(String[] args) {
		int []array= {1, 2, 3, 4, 5, 6};
		rearrangeArray(array);
	}
	
}
