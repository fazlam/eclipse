package com.xworkz.laptop.things;

import constant.names;

public class Saloon {
	public static String shopName="Maharaja saloon";
	public names ownerName=names.PRSHANT;
	public String type;
	public String location;
	public int noOfWorker;
	
	static {
		
	}
	public Saloon(String type,String location) {
		this.type=type;
		this.location=location;
		
		
	}
	public void showSaloon() {
		System.out.println("shop name:"+ shopName);
		System.out.println("owner name:"+ names.PRSHANT);
		System.out.println("type of saloon:"+ this.type);
		System.out.println("location of saloon:"+ this.location);
		System.out.println("number of workers:"+ noOfWorker);
	}
	
	

}
