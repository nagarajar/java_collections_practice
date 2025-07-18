package practice.java.collections.array;

import java.util.ArrayList;
import java.util.List;

public class UseCustomArrayList {

	public static void main(String[] args) {
		//1. Take the ArrayList and compare with CustomArrayList
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		//output: [10, 20, 30, 40, 50, 60]
		
		//2. let us create the same method like add/insert in customArrayList and use here
		CustomArrayList cal = new CustomArrayList(5);
		cal.insert(10);
		cal.insert(20);
		cal.insert(30);
		cal.insert(40);
		cal.insert(50);
		
		//output: practice.java.collections.array.CustomArrayList@24d46ca6
		//3. we need to override the toString method
		System.out.println(cal);
		
		//4. When you try to insert 6th element will get this issue: will solve by growing the array
		// As solved in ArrayList
		cal.insert(60); //output: java.lang.ArrayIndexOutOfBoundsException
		System.out.println(cal);
		
		//5. will check with remove method in arrayList and will try implement the same in the customArray
		al.remove(3);
		System.out.println(al);
		
		//6. will try implement remove in the customArray
		cal.remove(3);
		System.out.println(cal);
		
		//7. will check with the get method
		System.out.println(al.get(2));
		
		//8. will implement get method in customArrayList
		System.out.println(cal.get(2));
		
		//9. will check with contains
		System.out.println(al.contains(10));
		System.out.println(al.contains(1));
		
		//10. will implement the contains method in customArrayList
		System.out.println(cal.contains(10));
		System.out.println(cal.contains(1));
		

	}

}
