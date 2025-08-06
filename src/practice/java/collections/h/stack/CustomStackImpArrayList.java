package practice.java.collections.h.stack;

public class CustomStackImpArrayList extends CustomVectorList{
	
	public Object push(Object o) {
		add(o);
		return o;
	}
	
	public synchronized Object pop() {
		Object o = get(index-1);
		remove(index-1);
		return o;
	}
	
	public synchronized Object peek() {
		return get(index-1);
	}
	
	public boolean isEmpty() {
		return vectorListData.length==0;
	}
	
	public synchronized int search(Object o) {
		for(int i=0; i<index-1;i++) {
			if(vectorListData[i]==o) {
				return i;
			}
		}
		return -1;
	}
}
