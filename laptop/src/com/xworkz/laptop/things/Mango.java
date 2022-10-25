package com.xworkz.laptop.things;

import constant.MangoColors;

public class Mango {
	public static String shopName="Arun mango shop";
	public MangoColors color=MangoColors.ORANG;
	public String type;
	public double price;
	public double weight;
	
	static {
		
	}
	public Mango(String type,double price) {
	 this.type=type;
	 this.price=price;
	}
	
	public void details() {
	 System.out.println("mango shop name:"+ shopName);
	 System.out.println("mango type:"+ this.type);
	 System.out.println("mango price:"+ this.price);
	 System.out.println("mango colors:"+ MangoColors.ORANG);
	 System.out.println("weight of mango:"+ weight);
	}
	

}
