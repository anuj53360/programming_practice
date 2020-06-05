package anuj_array_geeksforgeeks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DicimalToBinary {
	public static void dicimalToBinary(int number) {
		List<Integer> list=new ArrayList<>();
		while(number>0) {
			int x=number%2;
			list.add(x);
			number=number/2;
		}
     binarytoDecimal(list);	
	}
	
	public static void binarytoDecimal(List<Integer> list) {
		int sum=0;
		for (int i = 0; i < list.size(); i++) {
			sum+=i*Math.pow(2, list.get(i));
		}
System.out.println(sum);		
	}
	
	public static void main(String[] args) {
		int number=6;
		dicimalToBinary(number);
	}
}
