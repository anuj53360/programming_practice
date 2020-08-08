package java_practice;

import java.util.HashMap;

public class Practice2 {

	
	public static void main(String[] args) {
		String a=new String("A");
		String b=new String("A");
		int c=65;
		
		System.out.println(a==b);
		
		HashMap<String, Integer> map=new HashMap<>();
		map.put(a, c);
		map.put(b, c);
		System.out.println(map.get);
	}
	
}
