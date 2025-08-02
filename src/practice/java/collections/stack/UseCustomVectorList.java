package practice.java.collections.stack;

import java.util.List;
import java.util.Vector;

public class UseCustomVectorList {
	
	public static void main(String[] args) {
		
		List<Integer> vectorList = new Vector<>();
		vectorList.add(10);
		vectorList.add(20);
		vectorList.add(30);
		vectorList.add(40);
		vectorList.add(50);

		System.out.println("Vector List: "+vectorList);
		vectorList.remove(2);
		System.out.println("Vector List: "+vectorList);
		System.out.println("get(1): "+vectorList.get(1));
		System.out.println("contains(10): "+vectorList.contains(10));
		
		
		CustomVectorList customVectorList =  new CustomVectorList();
		customVectorList.add(10);
		customVectorList.add(20);
		customVectorList.add(30);
		customVectorList.add(40);
		customVectorList.add(50);

		System.out.println("Custom Vector List: "+customVectorList);
		customVectorList.remove(2);
		System.out.println("Custom Vector List: "+customVectorList);
		System.out.println("get(1): "+customVectorList.get(1));
		System.out.println("contains(10): "+customVectorList.contains(10));
		
	}

}
