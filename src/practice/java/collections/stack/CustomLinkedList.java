package practice.java.collections.stack;

import java.util.StringJoiner;

public class CustomLinkedList {

	class Node {
		Object data;
		Node next;

		Node(Object data) {
			this.data = data;
		}
	}

	Node head = null;

	public void add(Object data) {
		Node n = new Node(data);

		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}

	public void addBeforeHead(Object data) {
		Node n = new Node(data);

		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void addAfterSpecificElement(Object insert, Object after) {
		Node n = new Node(insert);
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
	}

	public Object remove(Object remove) {

		if (head != null) {
			Node temp = head;
//			int data = (int) temp.data;
			// first element
			if (temp.data == remove) {
				head = temp.next;
				temp.next = null;
				return temp.data;
			} else {

				// middle element
				Node previous = null;
				while (temp.next != null) {
//					data = (int) temp.data;
					if (temp.data == remove) {
						previous.next = temp.next;
						temp.next = null;
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
