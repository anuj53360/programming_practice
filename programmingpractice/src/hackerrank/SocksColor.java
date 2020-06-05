package hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SocksColor {

	
	static int sockMerchant(int n, int[] ar) {
		
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		int count=0;
		
		for(int i=0;i<ar.length;i++) {
			if(hashMap.containsKey(ar[i])) {
			hashMap.put(ar[i], hashMap.get(ar[i])+1);
			}else {
				hashMap.put(ar[i], 1);
			}
			}
		Set<Map.Entry<Integer, Integer>> set=hashMap.entrySet();
		int x=0;
		for(Entry entry:set) {
			int n1=(int) entry.getValue();
			
			if(n1>1) {
				
				x+=n1/2;
			}
			else {
				count++;
			}
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println(x);
		
//		HashSet<Integer> set=new HashSet<>();
//		int count=0;
//		for(int i=0;i<n;i++) {
//			if(!set.contains(ar[i])) {
//				set.add(ar[i]);
//			}else {
//				count++;
//				set.remove(ar[i]);
//			}
//		}
//		
//		System.out.println(count);
//		
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		int []array= {6,5,2,3,5,2,2,1,1,5,1,3,3,3,5};
		int n=array.length;
		sockMerchant(n,array);
	}
}
