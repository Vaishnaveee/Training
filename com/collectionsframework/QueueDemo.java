package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("lmn");
		queue.add("abc");
		queue.add("pqr");
		System.out.println(queue); //abc lmn pqr
		System.out.println("----peek---first element of the queue---");
		System.out.println(queue.peek()); //abc
		System.out.println("----poll---print and remove first element--");
		System.out.println(queue.poll()); //abc
		System.out.println(queue); //lmn pqr
		System.out.println("---remove an element----");
		queue.remove("lmn");
		System.out.println(queue);//[pqr]
		System.out.println("----searching-----");
		boolean status  = queue.contains("abc");
		System.out.println(status?"found":"not found");
		queue.forEach(System.out::println);
		System.out.println("-----removing all elements");
		//queue.removeAll(queue);
		queue.clear();
		System.out.println(queue);//[]
	}
}
