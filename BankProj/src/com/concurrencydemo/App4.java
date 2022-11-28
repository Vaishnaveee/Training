package com.concurrencydemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;

public class App4 {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();
		 
		queue.offer(3);
		queue.offer(1);
		queue.offer(4);
		//queue.offer(null); : null cannot be added throws NPE
		
		queue.addFirst(10);
		System.out.println(queue); //[10, 3, 1, 4]
		
		Deque<Integer> queue1 = new LinkedList<>();
		queue1.offer(3);
		queue1.offer(1);
		queue1.offer(4);
		queue1.offer(null); //its allowed will print null
		queue1.addFirst(10);
		System.out.println(queue1);
		
		Deque<Integer> queue2 = new ConcurrentLinkedDeque<>();
		queue2.offer(3);
		queue2.offer(1);
		queue2.offer(4);
		queue2.addFirst(10); //itr=[10,3,1,4]
		
		Iterator<Integer> itr = queue2.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + "--");
		}
	}
}
