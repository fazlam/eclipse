package com.xworkz.laptop.things;

import constant.Sweets;

public class Sweet {
	public static String shopName="sharma";
	
	public Sweets color=Sweets.WHITE;
	public double price;
	public String name;
	public double quantity;
	
	static {
		
	}
	public Sweet(String name)
	{
		this.name=name;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	
	public void showPrice()
	{
		System.out.println(shopName);
		System.out.println(Sweets.WHITE);
		System.out.println(this.quantity);
		System.out.println(this.name);
		System.out.println(this.price);
	
	
	}
	public void totalPrice()
	{
		double total=price*quantity;
		System.out.println(total);
	}

		
	}

	
	
	
	


