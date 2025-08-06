package practice.java.collections.a.array;

import java.util.StringJoiner;

public class CustomArrayList {

	Object[] arrayListData = null;
	
	public static int DEFAULT_CAPACITY =10;

	int index = 0;
	
	public CustomArrayList() {
		arrayListData = new Object[DEFAULT_CAPACITY];
	}

	public CustomArrayList(int initialCapacity) {
		arrayListData = new Object[initialCapacity];
	}

	
	//2. let us create the same method like add/insert in customArrayList and use here
	public void insert(Object o) {
	    if (o == null) {
	        throw new IllegalArgumentException("Null elements are not allowed.");
	    }
		growArraySizeDynamically();
		arrayListData[index] = o;
		index++;

	}

	
	//3. we need to override the toString method
	@Override
	public String toString() {

		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for (int i = 0; i < index; i++) {
				sj.add(arrayListData[i].toString());
		}
		return sj.toString();
	}
	
	//4. When you try to insert 6th element will get this issue: will solve by growing the array
	// As solved in ArrayList
	public void growArraySizeDynamically() {
		if(index >= arrayListData.length) {
			//1. Calculate the new size as we know array list size will grow 50% when it reached the last element
			int newSize = arrayListData.length + (arrayListData.length/2);
			//2. create the new array with the newSize
			Object[] newArray = new Object[newSize];
			//3. copy the data from old to new array
			for (int i = 0; i < arrayListData.length; i++) {
				newArray[i]=arrayListData[i];
			}
			//4. reassign the new array to the old reference
			arrayListData = newArray;
			
		}
	}
	
	//6. will try implement remove in the customArray
	public void removebyCopy(int removeIndex) {
		//1. copy the elements to the new array except removeIndex element
		Object[] newArray = new Object[arrayListData.length];
		//1.1 we achieve this by doing the left shifting the all elements after the removeIndex
		for (int i = 0; i < arrayListData.length-1; i++) {
			if(i>=removeIndex) {//0>3, 1>3, 2>3, 3>3, 4>3, 5>3
				newArray[i]=arrayListData[i+1];//4,5,6
			}else {
				newArray[i]=arrayListData[i];
			}
		}
		//4. reassign the new array to the old reference
		arrayListData = newArray;
		//3. After shifting reduce the global index by 1 because we are tracking using this one
		index=index-1;

	}
	
	public void remove(int removeIndex) {
		//1 we achieve this by doing the left shifting the all elements after the removeIndex
		for (int i = removeIndex; i < index-1; i++) {
			arrayListData[i]=arrayListData[i+1];//4,5
		}
		
		//2. assign null value to the last index
		arrayListData[index-1]=null;
	
		//3. After shifting reduce the global index by 1 because we are tracking using this one
		index--;
		
	}
	
	//8. will implement get method in customArrayList
	public Object get(int getIndex) {
		//1. will take getIndex and return
		return arrayListData[getIndex];
	}
	
	//10. will implement the contains method in customArrayList
	public boolean contains(Object obj) {
		for (int i = 0; i < arrayListData.length; i++) {
			if(arrayListData[i]==obj) {
				return true;
			}
		}
		return false;
	}

}
