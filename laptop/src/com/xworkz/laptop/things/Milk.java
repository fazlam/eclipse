package com.xworkz.laptop.things;

import constant.MilkBrands;

public class Milk {
	public static String color="white";
	public MilkBrands brand=MilkBrands.AMUL;
	public double price;
	public int weight;
	public String storeIn;
	
	static {
		
	}
	
	public Milk(double price,String storeIn){
		this.price=price;
		this.storeIn=storeIn;
	}
	public void display() {
		System.out.println("milk color:"+ color);
		System.out.println("milk brands:"+ MilkBrands.AMUL);
		System.out.println("milk price:"+ this.price);
		System.out.println("milk store in:"+ this.storeIn);
		System.out.println("milk weight:"+ weight);
	}
	

}
