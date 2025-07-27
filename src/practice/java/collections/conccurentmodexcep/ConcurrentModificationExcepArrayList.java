package practice.java.collections.conccurentmodexcep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExcepArrayList {
	public static void main(String[] args) {
		// When ConcurrentModificationException (CME) will come ?
		// Ans: When we are iterating over the collection object and performing structural modification(CRUD Operations)
		// will get this exception
		
		//1. Can you write an example for ConcurrentModificationException ?
		// Yes will try with ArrayList
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//2. Iterator is parent class for the collection
		Iterator<Integer> itr = list.iterator();
		//3. start the iterator and try to add the elements but also check at what situation CME will through ?
		while(itr.hasNext()) {
			itr.next();
			list.add(60);
		}
		//4. Note: If you check the ArrayList source code there is InnerClass Itr which implements Iterator (I)
		// When you go through it there is method checkForComodification there is small logic explains
		// If root.modCount != expectedModCount will get CME, the main logic here is when you perform any operation 
		// it increase the modCount and wherever they checking modCount will get the CME
		// So, CME is not only related to the multiple threads trying to add/delete the elements while iterating.
		// It might be single thread also it will come.
	}

}
