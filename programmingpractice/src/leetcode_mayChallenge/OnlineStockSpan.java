package leetcode_mayChallenge;

import java.util.ArrayList;
import java.util.List;

public class OnlineStockSpan {
    List<Integer> spans;
    List<Integer> prices;
	
    public OnlineStockSpan() {
		spans=new ArrayList<Integer>();
		prices=new ArrayList<Integer>();
	}
    
     public int next(int price) {
		int idx=prices.size()-1;
		while(idx>0 && prices.get(idx)<=price) {
			int span=spans.get(idx);
			idx=idx-span;
		}
		prices.add(price);
		int span=prices.size()-1-idx;
		spans.add(span);
    	 return span;
    }
	
	public static void main(String[] args) {
		
	}
}
