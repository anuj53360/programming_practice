package anuj_array_geeksforgeeks;

import java.util.Comparator;
import java.util.PriorityQueue;

class keyComprator implements Comparator<Key> {

	@Override
	public int compare(Key o1, Key o2) {
		if (o1.freq < o2.freq) {
			return 1;
		} else if (o1.freq > o2.freq) {
			return -1;
		}
		return 0;
	}
}

class Key {
	int freq;
	char ch;

	Key(int freq, char ch) {
		this.freq = freq;
		this.ch = ch;
	}
}

public class NoTwoCharacterAdajacent {

	int MAX_CHAR = 26;

	public void noTwoCharacterAdjacent(String s) {
		int n = s.length();
		int[] count = new int[MAX_CHAR];
		PriorityQueue<Key> queue = new PriorityQueue<>(new keyComprator());
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}

		for (char i = 'a'; i < 'z'; i++) {
			int val = i - 'a';
			if (count[val] > 0) {
				queue.add(new Key(count[val], i));
			}
		}
		s = "";

		Key prev = new Key(-1, '#');

		while (queue.size() > 0) {
			Key k = queue.peek();
			queue.poll();
			s = s + k.ch;
			if (prev.freq > 0) {
				queue.add(prev);
			}
			k.freq--;
			prev = k;

		}

		if (n != s.length())
			System.out.println(" Not valid String ");
		else
			System.out.println(s);

	}

	public static void main(String[] args) {
		String s = "bbbaa";
		NoTwoCharacterAdajacent adjacent = new NoTwoCharacterAdajacent();
		adjacent.noTwoCharacterAdjacent(s);
	}
}
