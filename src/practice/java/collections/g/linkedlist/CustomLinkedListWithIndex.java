package practice.java.collections.g.linkedlist;

import java.util.StringJoiner;


public class CustomLinkedListWithIndex {

	private int size = 0; // Tracks the number of nodes in the list
	
	class Node {
		Object data;
		Node next;
		int index;

		Node(Object data, int index) {
			this.data = data;
			this.index = index;
		}
	}

	Node head = null;

	public void add(Object data) {
		Node n = new Node(data, size);

		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
		size++;
	}

	public void addBeforeHead(Object data) {
		Node n = new Node(data, 0);

		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
		size++;
		refreshIndexes();
	}

	public void addAfterSpecificElement(Object insert, Object after) {
		Node n = new Node(insert, size);
		if (head == null) {
			head = n;
		} else {
			Node temp = head;

			while (temp.next != null) {
				if (temp.data == after) {
					n.next = temp.next;
					temp.next = n;
					break;
				} else {
					temp = temp.next;
				}
			}

			if (temp.data == after) {
				temp.next = n;
			}
		}
		 size++;
		 refreshIndexes();
	}

	public Object remove(Object remove) {

		if (head != null) {
			Node temp = head;
//			int data = (int) temp.data;
			// first element
			if (temp.data == remove) {
				head = temp.next;
				temp.next = null;
	            size--;
	            refreshIndexes();
				return temp.data;
			} else {

				// middle element
				Node previous = null;
				while (temp.next != null) {
//					data = (int) temp.data;
					if (temp.data == remove) {
						previous.next = temp.next;
						temp.next = null;
			            size--;
			            refreshIndexes();
						return temp.data;
					} else {
						previous = temp;
						temp = temp.next;
					}

				}
				// Last Element
//				data = (int) temp.data;
				if (temp.data == remove && null != previous) {
					previous.next = null;
		            size--;
		            refreshIndexes();
					return temp.data;
				}

			}
		}
		
		return null;
	}
	
	public Object getLastElement() {
		if(head==null) {
			return null;
		} else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			return temp.data;
		}
	}
	
    // Updates all node indexes based on their position in the list
    private void refreshIndexes() {
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            temp.index = idx++;
            temp = temp.next;
        }
    }
    
    // Returns the current size of the list
    public int getSize() {
        return size;
    }
    
    // Gets the node at the specified index
    public Object get(int idx) {
        if (idx < 0 || idx >= size) return null;
        Node temp = head;
        while (temp != null) {
            if (temp.index == idx) return temp.data;
            temp = temp.next;
        }
        return null;
    }

	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		if (head != null) {
			Node temp = head;
			while (temp.next != null) {
				sj.add(temp.data.toString());
				temp = temp.next;
			}
			sj.add(temp.data.toString());
		}
		return sj.toString();
	}

}
