package anuj_array_geeksforgeeks;

public class ConvertArrZigZag {

	public static void convertArrZigZag(int []array) {
		
		boolean flag=true;
		int temp=0;
		for (int i = 0; i <=array.length-2; i++) {
			if(flag) {
				if(array[i]>array[i+1]) {
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
			else {
				if(array[i]<array[i+1]) {
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
			flag=!flag;
		}
		
for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
}		
		
		
	}
	
	public static void main(String[] args) {
		int []array= {4, 3, 7, 8, 6, 2, 1};
		convertArrZigZag(array);
	}
}
