package com.stringdemo;

public class App1 {
	public static void main(String[] args) {
		/*
		 * String methods
		 */
		String str="hello java";
		String str1="Hello Java";
		System.out.println(str.equals(str1));
		
		System.out.println(str.toLowerCase().equals(str1.toLowerCase()));
		 
		//length
		System.out.println(str.length()); //10
		
		/*
		 * length in array is a property whereas in String its a method
		int[] i = {2,3};
		System.out.println(i.length()); //Arrays-length
		*/
		
		String fname="harry";
		String lname="potter";
		
		String name=fname.concat(" " +lname);
		System.out.println(name);
		
		String str4="                  harry potter                   ";
		System.out.println(str4.length());//49
		str4=str4.trim();
		System.out.println(str4.length());//12
		System.out.println(str4);
		
		String str5="hello java";
		String str6="hello java";
		
		System.out.println(str5.compareTo(str6));  //0
		str6="Hello world";
		
		System.out.println(str5.compareTo(str6));// 32
		System.out.println(str6.compareTo(str5));//-32
		
		char c = str6.charAt(2);
		System.out.println(c); //l
		
		String email="abc@gmail.com";
		System.out.println(email.contains("@")); //true
		String email1="abcgmail.com";
		System.out.println(email1.contains("@"));//false
		
		System.out.println(email.endsWith(".com"));//true
		
		System.out.println(email.equals("ABC@gmail.com"));//false
		System.out.println(email.equalsIgnoreCase("ABC@gmail.com"));//true
		
		String s10 ="harry potter"; //literal -10X
		
		System.out.println(s10 == "harry potter"); //-10X
		
		System.out.println(s10.equals("harry".concat(" potter"))); //true
		System.out.println(s10 == "harry".concat(" potter").intern()); //"harry".concat(" potter") = new String("harry potter")
	
		System.out.println(s10.indexOf("r"));//2
		System.out.println(s10.lastIndexOf("r"));//11
		
		s10 = s10.replace("potter", "magician");
		System.out.println(s10);//harry magician
		
		System.out.println(s10.substring(6)); //magician
		System.out.println(s10.substring(0,4));//harr
		System.out.println(s10.substring(0,5));//harry 
		 
		//split
		String name1="harry potter";
		String[] sarry = name1.split(" "); //["harry","potter"] - ""-delimiter
		System.out.println("fname: " + sarry[0]);
		System.out.println("lname: " + sarry[1]);
	}
}




