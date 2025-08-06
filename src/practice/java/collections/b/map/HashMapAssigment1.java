package practice.java.collections.b.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAssigment1 {
	
	public static void main(String[] args) {
	//1. WP to add unique department object to hashmap
	// Key: department object
	// Value: deptId
	
	Map<Department, Integer> deptHashMap = new HashMap<>();
	
	deptHashMap.put(new Department(101, "Mechanical"), 101);
	deptHashMap.put(new Department(101, "Mechanical"), 101);
	deptHashMap.put(new Department(102, "Electrical"), 102);
	deptHashMap.put(new Department(103, "Civil"), 103);
	deptHashMap.put(new Department(103, "Civil"), 103);
	deptHashMap.put(new Department(104, "Computer Science"), 104);
	deptHashMap.put(new Department(105, "Information Science"), 105);
	deptHashMap.put(new Department(106, "Chemical"), 106);
	deptHashMap.put(new Department(107, "Industrial"), 107);
	
	System.out.println("deptHashMap size: "+deptHashMap.size());
//	System.out.println(deptHashMap);
	System.out.println("Departments:");
	System.out.println("================================");
	for(Entry<Department, Integer> deptMap :deptHashMap.entrySet())
		System.out.println(deptMap);
	}
	

}
