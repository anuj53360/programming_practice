package codechef;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TouristTranslationTOTR {

	public static String touristTranslation(String englishstring,String bytelandstring,String byteland) {
		
		HashMap<String, String> hashmap=new HashMap<>();
		
		int j=0;
		for (int i = 0; i < bytelandstring.length(); i++) {
			hashmap.put(String.valueOf(englishstring.charAt(i)),String.valueOf(bytelandstring.charAt(j)));
			j++;
			}

		StringBuffer s=new StringBuffer();
		for (int i = 0; i <byteland.length(); i++) {
			String x=String.valueOf(byteland.charAt(i));
			if(byteland.charAt(i)=='_') {
			s.append(" ");
				System.out.println(s+"RRRRRRR");
			}
			
			
			else if(Character.isUpperCase(byteland.charAt(i))) {
				String c=hashmap.get(x.toLowerCase()).toUpperCase();
               	s.append(c);
               	System.out.println(s+"QQQQQQQQQ");
			}
			else if (Character.isLowerCase(byteland.charAt(i))) {
				String c=hashmap.get(String.valueOf(byteland.charAt(i)));
				s.append(c);
				System.out.println(s+"WWWWWWWWW");
			}
			 else {
				 s.append(x);
			 }
				
			
		}
		System.out.println(s);
		
		return "";
	}
	
	public static void main(String[] args) {
		String englishstring="abcdefghijklmnopqrstuvwxyz";
	   String bytelandstring="qwertyuiopasdfghjklzxcvbnm";
		String byteland="Bpke_kdc_epclc_jcijsc_mihyo?";
	   touristTranslation(englishstring,bytelandstring,byteland);		
		
	}
}
