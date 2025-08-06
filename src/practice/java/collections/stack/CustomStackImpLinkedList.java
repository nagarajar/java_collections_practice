package practice.java.collections.stack;

public class CustomStackImpLinkedList extends CustomLinkedList{
	
	public Object push(Object n) {
		add(n);
		return n;
	}
	
	public Object peek() {
		return getLastElement();
	}
	
	public Object pop() {
		if(peek()!=null)
			return remove(peek());
		return null;
	}
}
