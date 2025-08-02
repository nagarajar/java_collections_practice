package practice.java.collections.stack;

import java.util.StringJoiner;

public class CustomVectorList {
	
	Object[] vectorListData = null;
	
	public static int DEFAULT_CAPACITY = 10;
	
	int index = 0;
	
	public CustomVectorList() {
		vectorListData = new Object[DEFAULT_CAPACITY];
	}
	
	public CustomVectorList(int intialCapacity) {
		vectorListData = new Object[intialCapacity];
	}
	
	public synchronized void add(Object o) {
		if(o == null) {
			throw new IllegalArgumentException("Null elements are not allowed.");
		}
		if(index >= vectorListData.length) {
			int newSize = vectorListData.length+(vectorListData.length/2);
			Object[] newVectorList = new Object[newSize];
			for(int i=0; i<vectorListData.length; i++) {
				newVectorList[i]=vectorListData[i];
			}
			vectorListData=newVectorList;
		}
		vectorListData[index]=o;
		index++;
	}
	
	public synchronized void  remove(int removeIndex) {
		for(int i=removeIndex; i<index-1; i++) {
			vectorListData[i]=vectorListData[i+1];
		}
		vectorListData[index-1]=null;
		index--;
	}
	
	public synchronized Object get(int getIndex) {
		return vectorListData[getIndex];
	}
	
	public synchronized boolean contains(Object o) {
		for(int i =0; i<index; i++) {
			if(vectorListData[i]==o) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for(int i =0; i<index; i++) {
			sj.add(vectorListData[i].toString());
		}
		return sj.toString();
	}
	

}
