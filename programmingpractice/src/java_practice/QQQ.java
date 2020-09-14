package java_practice;

import java.util.HashSet;
import java.util.Scanner;

public class QQQ {

	    public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        */

HashSet<Integer> set=new HashSet<>();
set.
	        //Scanner
	        Scanner s = new Scanner(System.in);
	        int length = s.nextInt();                 // Reading input from STDIN
	           // Writing output to STDOUT
	        int []array=new int[length];

	        for(int i=0;i< length;i++){
	            array[i]=s.nextInt();
	        }
	        secondLargest(array);

	        // Write your code here

	    }
	   public static void secondLargest(int []array){
	       System.out.println("AAAA");
	      if(array.length<2){
	          System.out.println("NA");
	      }
	     int first=Integer.MIN_VALUE;
	     int second=Integer.MIN_VALUE;

	for(int i=0;i<array.length;i++){
	    if(array[i]>first){
	        second=first;
	        first=array[i];
	    }
	}
	System.out.println(second);
	}

	}

