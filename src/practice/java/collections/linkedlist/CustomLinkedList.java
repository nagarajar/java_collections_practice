package practice.java.collections.linkedlist;

public class CustomLinkedList {
	//1. What is the Data Structure of LinkedList(LL)
	//ans: its Node --> which includes data(Object) and next(Node - next node reference)
	class Node {
		Object data;
		Node next;//null
		Node(Object data){
			this.data=data;
		}
	}
	
	//2. In LL there will be first and last node, first - Head, last - Tail (will be node with next value null)
	Node head = null;
	
	//3. Create add method
	public void add(Object o) {
		//3.1 If you observe add method in LL which accept the data value
		// so its not type node then we need to create the Node obj first
		Node n = new Node(o);

		//3.3 check the first node null
		if(head==null) {
			head=n;
		} else {
		//3.4 We need to update the next node reference to the previous node once new element is added
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next; //get the next node 
			}
			temp.next=n; //Assign the next node reference where next is null
		}
	}
	
	//4. add the given element before the head
	public void addBeforeHead(Object o) {
		//1. create the node obj
		Node n = new Node(o);
		//2. let check the head is null or not
		if(head == null) {
			head = n;
		} else {
			//If head is present, assign it to current node next then point head = current node
			n.next = head;
			head = n;
		}
	}
	
	//5. add the given element after the specific element given 
	public void addAfterSpecificElement(Object insert, Object after) {
		//1. create the node obj
		Node n = new Node(insert);
		if(head==null) {
			head=n;
		} else {
			//2. when we use while loop the node will changes so use temp instead of changing the head;
			Node temp = head;
			if(temp.data == after) {
				//3. Note once you find the matching element first take the next and assign that to the current node(n) next then assign next as current node
				n.next = temp.next;
				temp.next = n;
			} else {
				while(temp.next != null) {
					temp = temp.next;
					if(temp.data==after) {
						n.next=temp.next;
						temp.next=n;
						break;
					}
				}
				
			}
		}
	}
	
	//6. remove the given element from the linked list
	public void remove(int remove) {
		//There are 3 conditions we have handle while removing
		//1. if the remove element is at head
		//2. if the remove element is in mid
		//3. if the remove element is at last
		
		if(head!=null) {
			//1. if the remove element is at head
			Node temp = head;
			Integer data = (Integer) temp.data;
			int nodeValue =  data.intValue();
			if(nodeValue==remove) {
				Node temp1 = temp.next;
				head = temp1;
				temp.next=null;
			} else {
				//2. if the remove element is in mid
				Node previous = null;
				while(temp.next!=null) {
					data = (Integer) temp.data;
					nodeValue =  data.intValue();
					
					if(nodeValue==remove) {
						previous.next = temp.next;
						temp.next = null;
						return;
					} else {
						previous = temp;
						temp = temp.next;
					}
				}
				//3. if the remove element is at last
				data = (Integer) temp.data;
				nodeValue =  data.intValue();
				if(nodeValue==remove && null!=previous) {
					previous.next = null;
				}
			}
			
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "[";
		//3.3 check the first node null
		if(head==null) {
			s=s+"";
		} else {
		//3.4 We need to update the next node reference to the previous node once new element is added
			Node temp = head;
			s=s+temp.data;	
			while(temp.next!=null) {
				temp = temp.next; //get the next node 
				s=s+", "+temp.data;	
			}
		}
		s=s+"]";
		return s;
	}
	
}
