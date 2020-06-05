package anuj_array_geeksforgeeks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Society {

	public static void readingFile() throws IOException {

		File file = new File("C:\\Users\\anuj5\\OneDrive\\Desktop\\readingfile.txt");
		BufferedReader bufferReader = new BufferedReader(new FileReader(file));

		String line;

		Map<String, Integer> map = new HashMap<>();
		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		while ((line = bufferReader.readLine()) != null) {
			if (line.contains(" ")) {
				String s[] = line.split(" ");
				if (map.containsKey(s[0])) {
					int x = map.get(s[0]);
					map.put(s[0], (x + Integer.valueOf(s[1])));
				} else {
					map.put(s[0], Integer.valueOf(s[1]));
				}
			} else if (line.equalsIgnoreCase("top")) {
				// System.out.println(map);
				Map<String, Integer> sortedByValue = map.entrySet().stream()
						.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors
								.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

//System.out.println(sortedByValue);

				ArrayList<Integer> list = new ArrayList<Integer>();
				ArrayList<String> list1 = new ArrayList<String>();
				for (Entry<String, Integer> st : sortedByValue.entrySet()) {
					list.add(st.getValue());
				}
				if (list.size() > 1) {
					int first = list.get(0);
					for (Entry<String, Integer> entry : sortedByValue.entrySet()) {
						if (entry.getValue().equals(first)) {
							list1.add(entry.getKey());

						}
					}
					Collections.sort(list1);
					System.out.println(list1.toString());
				}

			}
		}

		bufferReader.close();

	}

	public static void main(String[] args) throws IOException {
		readingFile();

	}
}
