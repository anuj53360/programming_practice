package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparesTriplet {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	int []array=new int[2];
		int count=0;
		int counter=0;
		while(count<a.size() &&count<b.size()) {
			int first=a.get(counter);
			int second=b.get(counter);
			if(first>second) {
				array[0]++;
			}else if(second>first) {
				array[1]++;
			}
			counter++;
			count++;
		}
	List<Integer> list=new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
    }
	
	public static void main(String[] args) {
		List a=Arrays.asList(17,28,30);
		List b=Arrays.asList(99,16,8);
		compareTriplets(a,b);
	}
}
