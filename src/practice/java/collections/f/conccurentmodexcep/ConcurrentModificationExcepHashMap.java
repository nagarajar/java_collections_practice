package practice.java.collections.f.conccurentmodexcep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExcepHashMap {
	public static void main(String[] args) {
		// When ConcurrentModificationException (CME) will come ?
		// Ans: When we are iterating over the collection object and performing structural modification(CRUD Operations)
		// will get this exception
		
		//1. Can you write an example for ConcurrentModificationException ?
		// Yes will try with HashMap
		Map<Integer, String> hashMap1 = new HashMap<>();
		//1.1 How can we resolve this CME ? using ConcurrentHashMap and ConcurrentSkipListMap
		// ConcurrentHashMap: This class is designed for concurrent, thread-safe access and modifications.
		// Its iterators are weakly consistent: they do NOT throw ConcurrentModificationException if the map is modified during iteration.
		// Unlike CopyOnWriteArrayList, it does NOT create a full copy or snapshot of the data for iteration.
		// Instead, the iterator may reflect some, all, or none of the modifications made to the map after the iterator was created.
		// This means you might see new entries added, or not, and you might see removed entries, or not, during iteration.
		Map<Integer, String> hashMap = new ConcurrentHashMap<>();
		hashMap.put(1, "A");
		hashMap.put(2, "H");
		hashMap.put(3, "l");
		hashMap.put(4, "K");
		hashMap.put(4, "m");
		
		//1.1 Convert map to entrySet
		Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
		//2. Iterator is parent class for the collection
		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
		//3. start the iterator and try to add the elements but also check at what situation CME will through ?
		while(itr.hasNext()) {
			itr.next();
			hashMap.put(7, "m");
		}
		
		//3.1 Other ways to to produce CME without iterator
		//1. 
//		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//		    hashMap.put(7, "C"); // ConcurrentModificationException thrown here
//		}
		//2.
//		for (Integer key : hashMap.keySet()) {
//		    hashMap.put(7, "D"); // CME
//		}
		//3.
//		for (String value : hashMap.values()) {
//		    hashMap.remove(1); // CME
//		}
		
		//4. Note: If you check the ArrayList source code there is InnerClass Itr which implements Iterator (I)
		// When you go through it there is method checkForComodification there is small logic explains
		// If root.modCount != expectedModCount will get CME, the main logic here is when you perform any operation 
		// it increase the modCount and wherever they checking modCount will get the CME
		// So, CME is not only related to the multiple threads trying to add/delete the elements while iterating.
		// It might be single thread also it will come.
		System.out.println(hashMap);
	}

}
