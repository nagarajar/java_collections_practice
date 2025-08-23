package practice.java.collections.j.tree;

import practice.java.collections.j.tree.BinaryTreeImplementation.Node;

public class TreeMainClass {

	public static void main(String[] args) {

		/*
		 * A Binary Tree is a hierarchical data structure in which each node has at most two children,
		 * referred to as the left child and the right child.
		 * Binary Trees are used for various applications such as hierarchical data representation,
		 * expression parsing, and as the foundation for more advanced tree structures like Binary Search Trees and Heaps.
		 * 
		 * Key Properties:
		 *  - Each node can have 0, 1, or 2 children.
		 *  - There is one special node called the root node, which is the top node of the tree.
		 *  - Leaf nodes are nodes that do not have any children.
		 *  - There is no specific ordering of nodes (unlike Binary Search Trees).
		 * 
		 * Common Binary Tree Operations:
		 *  - Insertion:        Adding a new node to the tree.
		 *  - Deletion:         Removing a node from the tree.
		 *  - Traversal:        Visiting all nodes in a specific order (e.g., Inorder, Preorder, Postorder, Level Order).
		 *  - Searching:        Finding a node with a given value.
		 * 
		 * In Java, a Binary Tree is typically implemented using a Node class, where each node contains data,
		 * a reference to the left child, and a reference to the right child.
		 * 
		 * Example Node definition:
		 *    class Node {
		 *        int data;
		 *        Node left, right;
		 *    }
		 * 
		 */
		// This is the manual representation of tree
		// If try size is big we can't represent like this.
		BinaryTreeImplementation bti = new BinaryTreeImplementation();
		bti.root = new Node(10);
		bti.root.left = new Node(20);
		bti.root.right = new Node(30);
		bti.root.left.left = new Node(25);
		bti.root.left.right = new Node(35);
		bti.root.right.left = new Node(40);
		bti.root.right.right = new Node(50);
		
		bti.inorder(bti.root);
		
		/*
		 * A Binary Search Tree (BST) is a specialized form of binary tree that maintains elements in a sorted order,
		 * enabling efficient insertion, deletion, and search operations.
		 * Each node contains a key, and the tree is structured so that:
		 *   - The left subtree of a node contains only nodes with keys less than the node’s key.
		 *   - The right subtree of a node contains only nodes with keys greater than the node’s key.
		 *   - Both the left and right subtrees must also be binary search trees.
		 *
		 * Key Properties:
		 *  - Each node can have 0, 1, or 2 children.
		 *  - The root node is the topmost node of the tree.
		 *  - All keys in the left subtree are less than the parent node’s key.
		 *  - All keys in the right subtree are greater than the parent node’s key.
		 *  - No duplicate keys (in a classic BST).
		 *
		 * Common BST Operations:
		 *  - Insertion:        Add a new key while maintaining BST properties.
		 *  - Deletion:         Remove a key and restructure the tree to preserve BST properties.
		 *  - Search:           Find a node with a given key efficiently.
		 *  - Traversal:        Visiting all nodes in a specific order (e.g., Inorder, Preorder, Postorder, Level Order)
		 *  
		 *  - Inorder: Visit everyone in order of age (youngest to oldest).
		 *	- Preorder: Start with the parent, then visit children.
		 *	- Postorder: Visit children first, then parent.
		 *	- Level Order: Visit everyone in each generation before moving to the next.
		 *
		 * In Java, a Binary Search Tree is typically implemented using a Node class, where each node contains a key,
		 * a reference to the left child, and a reference to the right child.
		 *
		 * Example Node definition:
		 *    class Node {
		 *        int key;
		 *        Node left, right;
		 *    }
		 *
		 */
		
		BinarySearchTreeImplementation bsti = new BinarySearchTreeImplementation();
		bsti.add(10);
		bsti.add(5);
		bsti.add(15);
		bsti.add(3);
		bsti.add(18);
		bsti.add(6);
		bsti.add(12);
		
		System.out.println("bti :"+bsti);
		
		/*
		 * Ways to print (traverse) a Binary Search Tree (BST):
		 *
		 * 1. Inorder Traversal:
		 *    - Visits left subtree, then root, then right subtree.
		 *    - Prints values in sorted (ascending) order.
		 *
		 * 2. Preorder Traversal:
		 *    - Visits root first, then left subtree, then right subtree.
		 *    - Useful for copying the tree or creating a prefix expression.
		 *
		 * 3. Postorder Traversal:
		 *    - Visits left subtree, then right subtree, then root.
		 *    - Useful for deleting the tree or creating a postfix expression.
		 *
		 * 4. Level Order Traversal (Breadth-First):
		 *    - Visits nodes level by level from top to bottom, left to right.
		 *    - Good for visually displaying the tree structure.
		 *
		 * Example in Everyday Language (like a family tree):
		 *    - Inorder:   Visit everyone in order of age (youngest to oldest).
		 *    - Preorder:  Start with the parent, then visit children.
		 *    - Postorder: Visit children first, then parent.
		 *    - Level Order: Visit everyone in each generation before moving to the next.
		 *
		 * Inorder is most common for showing BST values in order.
		 */
		System.out.println("--------------------------------------------------");
		System.out.println("Inorder Traversal");
		bsti.printInOrder(bsti.root);
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("Preorder Traversal");
		bsti.printPreOrder(bsti.root);
		System.out.println("--------------------------------------------------");
		System.out.println("Postorder Traversal");
		bsti.printPostOrder(bsti.root);
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("Level Order Traversal");
		bsti.printLevelOrder(bsti.root);
		System.out.println("--------------------------------------------------");

	}

}
