package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

	public static int[] serviceLane(int n,int []width,int [][]cases){
        	int i=0;
        	int j=0;
        	int l=0;
        	int m=1;
        	int s=0;
        	List<Integer> list=new ArrayList<>();
        	int []array=new int[n];
        	
        	while (i<cases.length && l<cases.length) {
        		int min=Integer.MAX_VALUE;
				int x=cases[i++][j];
				int y=cases[l++][m];
        	for (int p = x; p <=y; p++) {
			if(width[p]<min) 
				min=width[p];
        	}
        	array[s]=min;
        	s++;
        	}
		return array;
	}
	
	public static void main(String[] args) {
	int n=5;
	int []width= {2,3,1,2,3,2,3,3};
	int [][]cases= {{0,3},{4,6},{6,7},{3,5},{0,7}};
	serviceLane(n,width,cases);
	}
}
