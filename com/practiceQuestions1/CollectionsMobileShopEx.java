package com.practiceQuestions1;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsMobileShopEx {
	public static void main(String[] args) throws Exception{
		Mobile obj = new Mobile();
		System.out.println(obj.addMobile("Oppo", "K3"));//model successfully added
		System.out.println(obj.getModel("Oppo")); //[K3]
		System.out.println(obj.buyMobile("Oppo", "K3")); //mobile sold successfully
	}
}

class Mobile{
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	
	String addMobile(String company, String model) {
		boolean isPresent = mobiles.containsKey(company);
		if(isPresent) {
			mobiles.get(company).add(model);
		}
		else {
			ArrayList<String> list = new ArrayList<>();
			list.add(model); 
			mobiles.put(company, list);
		}
		return "model successfully added";
	}
	
	ArrayList<String> getModel(String company){
		boolean isPresent = mobiles.containsKey(company);
		if(isPresent)
			return mobiles.get(company);
		else
			return null;
	}
	
	String buyMobile(String company, String model) {
		boolean isPresent = mobiles.containsKey(company);
		if(!isPresent) {
			return "item not available";
		}
		ArrayList<String> models = mobiles.get(company);
		if(models.remove(model)) {
			models.removeAll(models);
			return "mobile sold successfully";
		}else {
			return "item not available";
		}
	}
}


//samsung ["A10","A11"]