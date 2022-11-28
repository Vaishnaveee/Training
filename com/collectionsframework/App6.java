package com.collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class App6 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("harry", "potter");
		map.put("ron", "weasley");
		map.put("hermione", "granger");
		
		String psw = map.get("harry");
		System.out.println(psw); //potter
		System.out.println("=======Fetching and iterating thru keys========");
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("=======Fetching and iterating thru values========");
		for(String val : map.values()) {
			System.out.println(val);
		}
		System.out.println("=======Iterating thru Map entryset========");
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		System.out.println("=========searching==========");
		String username="vee";
		boolean status = map.containsKey(username);
		System.out.println(status?"username present": "not present");
		
		String password="granger";
		status=map.containsValue(password);
		System.out.println(status?"password present": "not present");
	}
}






