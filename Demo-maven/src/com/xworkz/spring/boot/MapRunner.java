package com.xworkz.spring.boot;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		Map<String, Double>map= new HashMap<String, Double>();
		map.put("Bengulur",29.5);
		map.put("Bidar",24.6);
		map.put("Rajistan",30.50);
		map.put("Hydrabad",26.5);
		map.put("Chainai",30.45);
		map.put("Kolkata",21.5);
		map.put("Hassan",22.5);
		map.put("Belarri",24.5);
		map.put("Raichur",25.5);
		map.put("Bijapur",29.5);
		
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
