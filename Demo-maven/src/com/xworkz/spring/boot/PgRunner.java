package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PgRunner {

	public static void main(String[] args) {
		Map<String, Double>map= new HashMap<String, Double>();
		map.put("Annupurneshwary",6500d);
		map.put("Rajaraju pg",5500d);
		map.put("Sai Girls pg",4000d);
		map.put("Khushhi pg",3500d);
		map.put("Sagar pg",4500d);
		map.put("Maharaja pg",8000d);
		map.put("Find out pg",8500d);
		map.put("Annu pg",5000d);
		map.put("veena pg",6000d);
		map.put("malesh pg",7500d);
		
		System.out.println(map.size());
		if(map.isEmpty()) {
			System.err.println("map is empty");
		}else {
			System.out.println("map is full");
		}
		System.out.println("finding the key by useing the keyset method..........");
		Set<String> keys=map.keySet();
		keys.forEach(e->System.out.println(e));
		
		System.out.println("finding the values by useing the values method..........");
		Collection<Double>values=map.values();
		values.forEach(e->System.out.println(e));
		
		System.out.println("finding the paire by useing the entry method..........");
		Set<Entry<String, Double>>entrys=map.entrySet();
		for(Entry<String, Double>entry:entrys) {
			System.out.println(entry.getKey() + " " + entry.getValue());	
		
		}
	}

}
