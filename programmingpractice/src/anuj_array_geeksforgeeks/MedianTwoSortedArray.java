package anuj_array_geeksforgeeks;

public class MedianTwoSortedArray {

	public static double medianTwoSorted(int[] array1, int[] array2) {
		int length1=array1.length;
		int length2=array2.length;
		int index=0;
		int i=0;
		int j=i;
		
		int []temp=new int[length1+length2];
		while(i<length1 && j<length2) {
			if(array1[i]<array2[j]) {
				temp[index]=array1[i];
				i++;
			}else {
				temp[index]=array2[j];
			    j++; 
			}
		index++;
		}
		
		while(i<length1) {
			temp[index]=array1[i];
			index++;
			i++;
		}
		
		while(j<length2) {
			temp[index]=array2[j];
			index++;
			j++;
		}
		
	return	getMedian(temp);
	}
	
	private static double getMedian(int[] temp) {
		
		int length=temp.length;
		if(length%2==0) {
			return (double)temp[(length-1)/2]+temp[(length-1)/2+1]/2;
		}else {
			return temp[(length-1)/2];
		}
		
	}

	public static void main(String[] args) {
		int []array1= {1,2,3};
		int []array2= {4,5};
		medianTwoSorted(array1,array2);
	}
}
