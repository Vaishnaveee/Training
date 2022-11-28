package com.concurrencydemo;

import java.util.concurrent.*;
import java.util.*; 
public class App {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		
		map.put(1,"harry");
		map.put(4,"draco");
		map.put(2,"ron");
		
		map.putIfAbsent(2, "hermione"); //since key 2 is present it will not add another entry for same key
		map.putIfAbsent(3, "hermione"); //since key 3 is not present it will be added. 
		System.out.println(map);
		//put will replace the existing value with new value
		map.put(1, "snape");
		System.out.println(map);
		//replace will also replace existing value with new value
		map.replace(1, "snape", "harry");
		System.out.println(map);
		
		/*
		 * removal of value
		 */
		//removes an element with key 4 
		map.remove(4); 
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
	}
}
