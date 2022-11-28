package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("pqr");
		set.add("abc");
		set.add("lmn");
		set.add("pqr");
		//set.add(null); --if null is passed to set it gives NPE
		System.out.println(set);
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("abc");
	
		Set<String> set1 = new TreeSet<>(list);
		System.out.println(set1);
	}
}
