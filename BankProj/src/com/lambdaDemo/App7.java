package com.lambdaDemo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App7 {
	public static void main(String[] args) {
		Implementation i = new Implementation();
		System.out.println(i.display((String team) ->{
			return team.equals("csk")?"4 trophies": team.equals("kkr")?"3 th":"invalid";
		}));
		
		 
	}
}


interface IPL{
    String getTrophyDetails(String team); 
}

class Implementation{
	String display(IPL ipl) {
		return ipl.getTrophyDetails("uuuu");
	}
}
 