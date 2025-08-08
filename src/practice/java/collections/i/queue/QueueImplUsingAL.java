package practice.java.collections.i.queue;

import java.util.StringJoiner;

public class QueueImplUsingAL {
	
	//1. Initial properties
	Object[] arr = null;
	int index = 0;
	int DEFUALT_CAPACITY = 10;

	public QueueImplUsingAL() {
		arr= new Object[DEFUALT_CAPACITY];
	}
	
	public QueueImplUsingAL(int capacity) {
		arr= new Object[capacity];
	}
	
	//push
	public Object add(Object obj) {
		//growable array size
		if(index>=arr.length) {
			int newSize = arr.length + arr.length/2;
			Object[] newArr = new Object[newSize];
			for(int i=0; i<arr.length; i++) {
				newArr[i]=arr[i];
			}
			arr=newArr;
		}
		arr[index]=obj;
		index++;
		return obj;
	}
	
	//peek
	public Object peek() {
		if(arr.length==0) return null;
		return arr[0];
	}
	
	//peek
	public Object poll() {
		if(arr.length==0) return null;
		Object firstElement = arr[0];
		int remove = 0;
		for(int i=0; i<index; i++) {
			if(i< remove) {
				arr[i]=arr[i];
			}else {
				arr[i]=arr[i+1];
			}
		}
		index--;
		return firstElement;
	}
	
	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(", ","[","]");
		for(int i = 0; i<index; i++) {
			sj.add(arr[i].toString());
		}
		return sj.toString();
	}
}
