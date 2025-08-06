package practice.java.collections.stack;

import java.util.Stack;

public class UseCustomStack {

	public static void main(String[] args) {
		// A Stack is a linear data structure that follows the Last In, First Out (LIFO) principle.
		// The last element added (pushed) to the stack is the first one to be removed (popped).
		// It extends the Vector class and provides standard stack operations.
		/*
		 * Method Description 
		 * push(item) Adds an item to the top of the stack 
		 * pop() Removes and returns the top item 
		 * peek() Returns the top item without removing it
		 * isEmpty() Checks if the stack is empty 
		 * search(item) Returns the 1-based position from the top
		 */
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Stack: "+stack);
		System.out.println("Stack:pop() - "+stack.pop());
		System.out.println("Stack: "+stack);
		System.out.println("Stack:peek() "+stack.peek());
		System.out.println("Stack: "+stack);
		System.out.println("Stack:isEmpty() "+stack.isEmpty());
		System.out.println("Stack:search(item) "+stack.search(30));
		
		System.out.println("***********************************************");
		//Try the same by your custom stack
		CustomStackImpArrayList customStack = new CustomStackImpArrayList();
		customStack.push(10);
		customStack.push(20);
		customStack.push(30);
		customStack.push(40);
		customStack.push(50);
		System.out.println("Custom Stack: "+customStack);
		System.out.println("Custom Stack:pop() - "+customStack.pop());
		System.out.println("Custom Stack: "+customStack);
		System.out.println("Custom Stack:peek() "+customStack.peek());
		System.out.println("Custom Stack: "+customStack);
		System.out.println("Custom Stack:isEmpty() "+customStack.isEmpty());
		System.out.println("Stack:search(item) "+customStack.search(30));
		
		System.out.println("***********************************************");
		
		//Try the same by your custom stack
		CustomStackImpLinkedList cSLl = new CustomStackImpLinkedList();
		cSLl.push(10);
		cSLl.push(20);
		cSLl.push(30);
		cSLl.push(40);
		cSLl.push(50);
		System.out.println("Custom Stack by LL: "+cSLl);
		System.out.println("Custom Stack by LL:pop() - "+cSLl.pop());
		System.out.println("Custom Stack by LL: "+cSLl);
		System.out.println("Custom Stack by LL:peek() "+cSLl.peek());
		System.out.println("Custom Stack by LL: "+cSLl);
		System.out.println("Custom Stack by LL:pop() - "+cSLl.pop());
		System.out.println("Custom Stack by LL: "+cSLl);
		System.out.println("Custom Stack by LL:peek() "+cSLl.peek());
		System.out.println("Custom Stack by LL: "+cSLl);
//		System.out.println("Custom Stack:isEmpty() "+cSLl.isEmpty());
//		System.out.println("Stack:search(item) "+cSLl.search(30));
		
		
		
	}
}
