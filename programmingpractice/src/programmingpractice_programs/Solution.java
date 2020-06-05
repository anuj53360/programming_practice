package programmingpractice_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.corba.se.impl.orbutil.closure.Future;

public class Solution {

	 public static int  solution(String s) {
		String s1="";
		int n=s.length();
		 for (int i = 0; i < n; i++) { 
	           for (int j = i+1; j <= n; j++) { 
	            s1=s.substring(i, j);
		
		
		if(s1.length()>1) {
			StringBuffer sb=new StringBuffer();
			boolean b=false;
		for (int j2 = 0; j2 < s1.length(); j2++) {
			char c=Character.toUpperCase(s1.charAt(i));
             for (int k = 0; k < s1.length(); k++) {
				char c1=s1.charAt(k);
				if (String.valueOf(c).equalsIgnoreCase(String.valueOf(c1))) {
				b=true;
				}
				else {
					b=false;
				}
			}
			}	
		
		System.out.println(s1);
		}
	           }
		 }
		 
		
		 
		 
		 
		 return 0;
	        
	    }
	 
	 
	 
	
	public static void main(String[] args) {
//		String s="azABaabza";
//		solution(s);
		
//		int a = 1;
//		String str = null;
//		if(a==1 || str.substring(0,1)=="a") {
//		System.out.println("one");
//		}
//
//		if(a>1&& str.substring(0,1)=="a") {
//		System.out.println("two");
//		}
		
//		System.out.println(1/10);
//		System.out.println(1%10);
		
		ExecutorService excutorservice=Executors.newFixedThreadPool(50);
		List<String> list=new ArrayList<>();
		int j=1;
		Callable<Integer> callable=()->{
			
			String a=m1(j);
			list.add(a);
			
		};
	
//		for (int i = 0; i < 50; i++) {
//			excutorservice.execute(runnable); 	
//		}
	//	excutorservice.submit(runnable); 
		
		
		excutorservice.execute(() ->{
			for (int i = 0; i < 10; i++) {
				String a=m1(i);
				list.add(a);	
			}
			
		});
	}

	
	



	private static String m1(int j) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(j);
		return "myname";
		
	}
}
