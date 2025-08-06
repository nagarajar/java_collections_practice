package practice.java.collections.d.sortmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {
	public static void main(String[] args) {
		//1. create the hashmap and add the entry into it
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("A", 101);
		hashMap.put("D", 105);
		hashMap.put("C", 103);
		hashMap.put("a", 104);
		hashMap.put("E", 102);
		hashMap.put("b", 106);
		
		System.out.println("HashMap before sort: "+hashMap);
		
		//2. WP(Write the program to sort hashmap by key
		//1st solution is by passing the hashmap to the treemap
		//TreeMap sort by default by Key
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println("HashMap After sort by treeMap: "+treeMap);
		
		//2nd solution is using collections.sort
		//a. convert hashmap to entry set
		Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
		//b. convert the set to list
		List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
		//c. pass the list to collections.sort but here you need to pass the comparator
		// you can write the anonymous impl or lamda expression instead implementing in separate class.
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		System.out.println("HashMap After sort by list key sort: "+list);
		//d. sort by value
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("HashMap After sort by list key value: "+list);
		}

}
