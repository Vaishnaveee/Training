package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class App5 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("abc");
		list.add("pqr");
		//list.add(null);
		list.add("pqr");
		list.add("lmn");
		//Collections.sort(list); //Null Pointer Exception due to null value.
		System.out.println(list);
	}
}
/*LinkedList follows insertion order. 
 * list:10X	
 * 10X:abc:20X
 * 20X:pqr:30X
 * 30X:lmn
 * 
 * Due to this, it is a slower implementation. As oppossed to this, 
 * ArrayList does not guarantee any ordering and hence it is fastest. 
 * Vector is an older implementation of ArrayList, its slower and hence should
 * be avoided. 
 * 
 * ArrayList, LinkedList both take null values and duplicates. However, 
 * in case of null values, Sorting will give NPE. 
 */
