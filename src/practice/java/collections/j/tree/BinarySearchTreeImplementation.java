package practice.java.collections.j.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class BinarySearchTreeImplementation {

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root = null;

	public void add(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
		} else {
			Node temp = root;
			while (true) {
				if (data < temp.data) {
					if (temp.left != null) {
						temp = temp.left;
					} else {
						temp.left = n;
						return;
					}
				} else {
					if(temp.data == data) { // No duplicates insertion
						return;
					}
					if (temp.right != null) {
						temp = temp.right;
					} else {
						temp.right = n;
						return;
					}
				}
			}
		}
	}
	
	/*
	    10
	   /  \
	  5    15
	 / \   / \
	3   6 12 18
	
	1. Inorder Traversal (IN, LNR):
	- Visits left subtree, then root, then right subtree.
	- Prints values in sorted (ascending) order.
	- Analogy: Visit everyone in order of age (youngest to oldest).
	
	Example code:
	public void printInOrder(Node root) {
	 if (root != null) {
	     printInOrder(root.left);
	     System.out.println(root.data);
	     printInOrder(root.right);
	 }
	}
	
	Step-by-step execution for printInOrder(10):
	printInOrder(10) {
	 if(10!=null) {
	     printInOrder(5) // 10.left
	         if(5!=null) {
	             printInOrder(3) // 5.left
	                 if(3!=null) {
	                     printInOrder(null) // 3.left
	                     sysout(3)
	                     printInOrder(null) // 3.right
	                 }
	             sysout(5)
	             printInOrder(6) // 5.right
	                 if(6!=null) {
	                     printInOrder(null) // 6.left
	                     sysout(6)
	                     printInOrder(null) // 6.right
	                 }
	         }
	     sysout(10)
	     printInOrder(15) // 10.right
	         if(15!=null) {
	             printInOrder(12) // 15.left
	                 if(12!=null) {
	                     printInOrder(null) // 12.left
	                     sysout(12)
	                     printInOrder(null) // 12.right
	                 }
	             sysout(15)
	             printInOrder(18) // 15.right
	                 if(18!=null) {
	                     printInOrder(null) // 18.left
	                     sysout(18)
	                     printInOrder(null) // 18.right
	                 }
	         }
	 }
	}
	
	Result: 3, 5, 6, 10, 12, 15, 18
	*/
	public void printInOrder(Node root) {
		if(root!=null) {
			printInOrder(root.left);
			System.out.print(root.data +", ");
			printInOrder(root.right);
		}
	}

	/*
	    10
	   /  \
	  5    15
	 / \   / \
	3   6 12 18
	
	
	* 2. Preorder Traversal (PR, NLR):
	*    - Visits root, then left subtree, then right subtree.
	*    - Useful for copying the tree or generating a prefix expression.
	*    - Analogy: Start with the parent, then visit children.
	*
	* Example code:
	* public void printPreOrder(Node root) {
	*     if (root != null) {
	*         System.out.println(root.data);
	*         printPreOrder(root.left);
	*         printPreOrder(root.right);
	*     }
	* }
	*
	* Step-by-step execution for printPreOrder(10):
	* printPreOrder(10) {
	*   if(10!=null) {
	*     sysout(10)
	*     printPreOrder(5) // 10.left
	*       if(5!=null) {
	*         sysout(5)
	*         printPreOrder(3) // 5.left
	*           if(3!=null) {
	*             sysout(3)
	*             printPreOrder(null) // 3.left
	*             printPreOrder(null) // 3.right
	*           }
	*         printPreOrder(6) // 5.right
	*           if(6!=null) {
	*             sysout(6)
	*             printPreOrder(null) // 6.left
	*             printPreOrder(null) // 6.right
	*           }
	*       }
	*     printPreOrder(15) // 10.right
	*       if(15!=null) {
	*         sysout(15)
	*         printPreOrder(12) // 15.left
	*           if(12!=null) {
	*             sysout(12)
	*             printPreOrder(null) // 12.left
	*             printPreOrder(null) // 12.right
	*           }
	*         printPreOrder(18) // 15.right
	*           if(18!=null) {
	*             sysout(18)
	*             printPreOrder(null) // 18.left
	*             printPreOrder(null) // 18.right
	*           }
	*       }
	*   }
	* }
	*
	* Result: 10, 5, 3, 6, 15, 12, 18
	*/
	public void printPreOrder(Node root) {
		StringJoiner sj = new StringJoiner(", ");
		collectPreOrderResult(root,sj);
		System.out.println(sj.toString());
	}
	
	//Example to avoid last , 
	public void collectPreOrderResult(Node root, StringJoiner sj) {
		if(root!=null) {
			sj.add(String.valueOf(root.data));
			collectPreOrderResult(root.left, sj);
			collectPreOrderResult(root.right, sj);
		}
	}

	/*
	    10
	   /  \
	  5    15
	 / \   / \
	3   6 12 18
	
	
	* 3. Postorder Traversal (PO, LRN):
	*    - Visits left subtree, then right subtree, then root.
	*    - Useful for deleting the tree or generating a postfix expression.
	*    - Analogy: Visit children first, then parent.
	*
	* Example code:
	* public void printPostOrder(Node root) {
	*     if (root != null) {
	*         printPostOrder(root.left);
	*         printPostOrder(root.right);
	*         System.out.println(root.data);
	*     }
	* }
	*
	* Step-by-step execution for printPostOrder(10):
	* printPostOrder(10) {
	*   if(10!=null) {
	*     printPostOrder(5) // 10.left
	*       if(5!=null) {
	*         printPostOrder(3) // 5.left
	*           if(3!=null) {
	*             printPostOrder(null) // 3.left
	*             printPostOrder(null) // 3.right
	*             sysout(3)
	*           }
	*         printPostOrder(6) // 5.right
	*           if(6!=null) {
	*             printPostOrder(null) // 6.left
	*             printPostOrder(null) // 6.right
	*             sysout(6)
	*           }
	*         sysout(5)
	*       }
	*     printPostOrder(15) // 10.right
	*       if(15!=null) {
	*         printPostOrder(12) // 15.left
	*           if(12!=null) {
	*             printPostOrder(null) // 12.left
	*             printPostOrder(null) // 12.right
	*             sysout(12)
	*           }
	*         printPostOrder(18) // 15.right
	*           if(18!=null) {
	*             printPostOrder(null) // 18.left
	*             printPostOrder(null) // 18.right
	*             sysout(18)
	*           }
	*         sysout(15)
	*       }
	*     sysout(10)
	*   }
	* }
	*
	* Result: 3, 6, 5, 12, 18, 15, 10
	*/
	public void printPostOrder(Node root) {
		if(root!=null) {
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.print(root.data +", ");
		}
	}

	/*
	    10
	   /  \
	  5    15
	 / \   / \
	3   6 12 18
	
	
	* 4. Level Order Traversal (LO, BFS):
	*    - Visits nodes level by level from top to bottom, left to right.
	*    - Uses a queue to keep track of nodes to visit next.
	*    - Analogy: Visit everyone in each generation before moving to the next.
	*
	* Example code:
	* public void printLevelOrder(Node root) {
	*     if (root == null) return;
	*     Queue<Node> queue = new LinkedList<>();
	*     queue.add(root);
	*     while (!queue.isEmpty()) {
	*         Node curr = queue.poll();
	*         System.out.println(curr.data);
	*         if (curr.left != null) queue.add(curr.left);
	*         if (curr.right != null) queue.add(curr.right);
	*     }
	* }
	*
	* Step-by-step execution for printLevelOrder(10):
	*
	* 1. Start with the root node (10) in the queue.
	*    Queue: [10]
	*
	* 2. Remove 10, print it. Add its children (5, 15) to the queue.
	*    sysout(10)
	*    Queue: [5, 15]
	*
	* 3. Remove 5, print it. Add its children (3, 6) to the queue.
	*    sysout(5)
	*    Queue: [15, 3, 6]
	*
	* 4. Remove 15, print it. Add its children (12, 18) to the queue.
	*    sysout(15)
	*    Queue: [3, 6, 12, 18]
	*
	* 5. Remove 3, print it. 3 has no children, so nothing is added.
	*    sysout(3)
	*    Queue: [6, 12, 18]
	*
	* 6. Remove 6, print it. 6 has no children.
	*    sysout(6)
	*    Queue: [12, 18]
	*
	* 7. Remove 12, print it. 12 has no children.
	*    sysout(12)
	*    Queue: [18]
	*
	* 8. Remove 18, print it. 18 has no children.
	*    sysout(18)
	*    Queue: []
	*
	* 9. The queue is empty. Traversal is finished.
	*
	* Output (level order): 10, 5, 15, 3, 6, 12, 18
	*/
	public void printLevelOrder(Node root) {
		if(root == null) return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		StringJoiner sj = new StringJoiner(", ");
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			sj.add(String.valueOf(current.data));
			if(current.left!=null) queue.add(current.left);
			if(current.right!=null) queue.add(current.right);
		}
		System.out.println(sj.toString());
	}
}
