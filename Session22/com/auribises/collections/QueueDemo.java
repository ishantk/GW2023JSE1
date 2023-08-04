package com.auribises.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10; i>=1;i--) {
			queue.add(i);
		}
		
		System.out.println("Initial Size of Queue is: "+queue.size()); // 10
		
		/*
		// peek : To read head of queue
		int head = queue.peek();
		System.out.println("head is: "+head);
		
		// Remove the Head of Queue
		queue.poll();
		head = queue.peek();
		System.out.println("head now is: "+head);
		
		queue.poll();
		
		System.out.println("Size of Queue is: "+queue.size());*/
		
		for(int i=0; i<queue.size(); i++) {
			System.out.println("head is: "+queue.peek());
			queue.poll();
		}
		
		System.out.println("Final Size of Queue is: "+queue.size()); 
		
		//queue.clear();
		//queue.contains(3);
		
	}

}
