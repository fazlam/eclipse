package com.xworkz.curd.runner;

import java.text.CollationKey;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Country {

	public static void main(String[] args) {
	
		Map<String , Integer> county=new LinkedHashMap<String, Integer>();
		county.put("India", 91);
		county.put("Uk", 66);
		county.put("USA", 22);
		county.put("Germany", 34);
		county.put("Cannada", 23);
		
		Collection<String> names=county.keySet();
		Collection<Integer> code=county.values();
		
		county.forEach((a,b)->System.out.println(county.containsKey(code));
		

	}

}
