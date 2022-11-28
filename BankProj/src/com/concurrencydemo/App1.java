package com.concurrencydemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class App1 {
	public static void main(String[] args) {
ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		
		map.put(1,"harry");
		map.put(4,"draco");
		map.put(2,"ron");
		
		map.putIfAbsent(2, "hermione"); //since key 2 is present it will not add another entry for same key
		map.putIfAbsent(3, "hermione");
		
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey() + "----" + m.getValue());
		}
		
		System.out.println("-------------------------");
		map.forEach( (k,v)-> 
		{ 
			System.out.println(k + "----" + v);
		}
		);
		System.out.println("--------------------------");
		map.forEach((k,v)-> System.out.println(k + " " + v)  );
		
		System.out.println("--------------------------");
		
		map.compute(5, (k,v)-> k>4?"snape":null );
		map.compute(5, (k,v)-> k>map.size()?"dumbledor":v );
		map.compute(5, (k,v)-> k>map.size()?"dumbledor":null );
		 
		System.out.println(map);
	}
}
