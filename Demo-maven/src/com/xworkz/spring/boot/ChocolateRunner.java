package com.xworkz.spring.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ChocolateRunner {

	public static void main(String[] args) {
		Map<String, Double>map= new HashMap<String, Double>();
		map.put("Munch",50.5);
		map.put("Five Star",100.5);
		map.put("Mango",250.5);
		map.put("Parke",300.5);
		map.put("DariyMilk",500.5);
		map.put("Dark fantacy",150.5);
		map.put("Alepnlebe",200.5);
		map.put("Kacha mango",150.5);
		map.put("Kit Kat",500.5);
		map.put("density",150.5);
		
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
