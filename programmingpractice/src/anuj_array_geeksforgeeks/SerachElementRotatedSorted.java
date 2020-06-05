package anuj_array_geeksforgeeks;

public class SerachElementRotatedSorted {
    
	public static int serachElementRotatedSorted(int []array,int key,int l,int r) {
		int mid =l+(r-l)/2;
		System.out.println(mid+" "+array[mid]);
		
		if(array[mid]==key) {
			return mid;
		}
		
		if(array[l]<array[mid]) {
		
		if(key>=array[l] && key<=array[mid]) {
			return serachElementRotatedSorted(array, key,l,mid-1);
		}
		return serachElementRotatedSorted(array, key,mid+1,r);
		}
		
		if(key>=array[mid] && key<=array[r]){
			return serachElementRotatedSorted(array, key,mid+1,r);
		}
		return serachElementRotatedSorted(array, key,l,mid-1);
		
	}
	
	public static void main(String[] args) {
		int []array= {4,5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key=3;
		int l=0;
		int r=array.length-1;
	int i=	serachElementRotatedSorted(array,key,l,r);
	System.out.println(i);
	}
}
