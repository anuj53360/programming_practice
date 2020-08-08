package anuj_array_geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//Design data structure which take constant time for
//insert(x)
//remove(x)
//search(x)
//getrandom()

public class DesignDataStructure {

	ArrayList<Integer> arraylist;
	HashMap<Integer, Integer> hashmap;

	public DesignDataStructure() {
		arraylist = new ArrayList<>();
		hashmap = new HashMap<>();
	}

	void insert(int x) {
		if (hashmap.get(x) != null)
			return;
		int size = arraylist.size();
		arraylist.add(x);
		hashmap.put(x, size);
	}

	void remove(int x) {
		if (hashmap.get(x) == null) {
			return;
		}

		int index = hashmap.get(x);
		arraylist.remove(index);
		int size = arraylist.size();
		Integer last = arraylist.get(size - 1);
		Collections.swap(arraylist, index, size - 1);
		hashmap.put(last, index);

	}

	public static void main(String[] args) {
		DesignDataStructure dds = new DesignDataStructure();
           dds.insert(22);
           dds.insert(23);
           dds.remove(22);
	}
}
