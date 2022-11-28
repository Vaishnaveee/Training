package com.stringdemo;

public class App5 {
	public static void main(String[] args) {
		String email="abc@gmail.com";
		
		boolean valid = email.matches("[a-zA-Z_]+@\\w+\\.\\w+");
		System.out.println("Email validation " + valid);
	}
}
/*
	Regex: 
\w : word[a-zA-Z0-9]
\d : number[0-9]
+  : one or more
*  : zero or more
^  : starts with
$  : ends with
\s : space
" ": space
*/