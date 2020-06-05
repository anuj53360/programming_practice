package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	
	public static int diagonalDifference(int [][]array) {
		
		int leftdigsum=0;
		int rightdigsum=0;
		
		for(int i=0;i<=array.length;i++) {
			for (int j = 0; j <=array[0].length-1; j++) {
				if(i==j) {
				leftdigsum=leftdigsum+array[i][j];
				}
				}
		}
		int k=0;
		int l=array[0].length-1;
		while(k<=array[0].length-1 && l>=0)
		{
		rightdigsum=rightdigsum+array[k][l];
		k++;
		l--;
		}
		return Math.abs(rightdigsum-leftdigsum);
	}
	
	
	public static void main(String[] args) {
		int [][]array= {{11,2 ,4},
				        {4 ,5 ,6},
				        {10 ,8,-12}};
//		List<Integer> l=Arrays.asList(11,2,4);
//		List<Integer> l1=Arrays.asList(4,5,6);
//		List<Integer> l2=Arrays.asList(10,8,-12);
//		List<List<Integer>> l3=new ArrayList<>();
//		l3.add(l);
//		l3.add(l1);
//		l3.add(l2);
		
		
		int difference=diagonalDifference(array);
		System.out.println(difference);
	}
}
