package com.auribises.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("John");
		stack.push("Jennie");
		stack.push("Jim");
		stack.push("Jack");
		stack.push("Joe");
		
		stack.pop();
		
		stack.remove(1);
		
		System.out.println("stack is: "+stack);
		System.out.println("stack peek(): "+stack.peek());
		
		System.out.println("Size of Stack is: "+stack.size());

	}

}
